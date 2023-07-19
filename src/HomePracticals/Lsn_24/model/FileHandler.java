package HomePracticals.Lsn_24.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private final String TICKET_FILE = "src/HomePracticals/Lsn_24/data.txt";

    // Read existing data from file and load
    public void loadTickets(TicketService service){
        try (BufferedReader reader = new BufferedReader(new FileReader(TICKET_FILE))) {
            String lineOfDataFile;
            List<Ticket> tempLoadedData = new ArrayList<>(); // Temporary list to convert string data to array list
            while ((lineOfDataFile = reader.readLine()) != null) {
                Ticket ticket = Ticket.fromDataString(lineOfDataFile);
                tempLoadedData.add(ticket);
                //Update ID counter
                Ticket.objCounter = Math.max(Ticket.objCounter, ticket.getId());
            }
            service.ticketList = tempLoadedData; // assign the loaded tickets to the original list
        }catch (FileNotFoundException e) {
            System.out.println("File doesn't exist.");
        }catch (IOException e) {
            System.out.println("Error while loading tickets: " + e.getMessage());
        }
    }


    // Empty the data file at all
    public void clearAllTickets(TicketService service) {
        service.ticketList.clear();
        File file = new File(TICKET_FILE);
        if (file.exists()) {
            if (file.delete()){
                System.out.println("Data file deleted.");
            }else {
                System.out.println("Failed to delete file.");
            }
        }else {
            System.out.println("No data file found.");
        }
    }

    // Storing all tickets to the file
    public void saveTickets(TicketService service) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TICKET_FILE))) {
            for (int i = 0; i < service.ticketList.size(); i++) {
                Ticket ticket = service.ticketList.get(i);
                writer.write(ticket.toDataString());
                writer.newLine();
            }
        }catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}
