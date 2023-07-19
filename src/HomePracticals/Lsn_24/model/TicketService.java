package HomePracticals.Lsn_24.model;

import HomePracticals.Lsn_24.util.Input;
import HomePracticals.Lsn_24.util.Priority;
import HomePracticals.Lsn_24.util.Status;

import java.util.ArrayList;
import java.util.List;

public class TicketService {
    FileHandler handler = new FileHandler();
    public List<Ticket> ticketList = new ArrayList<>();

    // this is an instance block example
    {
        handler.loadTickets(this); // loads ticket data from the file when class is initialized
    }

    // Create a new ticket and store to the file
    public List<Ticket> addTicket() {
        int entry = Input.inputNumber("How many tickets");
        while (entry != 0){
            String title = Input.inputString("Ticket title");
            String description = Input.inputString("Description");
            Priority priority = definePriority(0);
            Status status = Status.OPEN;

            ticketList.add(new Ticket(title, description, priority, status));
            handler.saveTickets(this); // saving the updated data to the file
            entry--;
        }
        Ticket ticket = ticketList.get(ticketList.size() - 1); // get by index of the last added ticket
        System.out.println(ticket.getAllDetails()); // and print to the console
        return ticketList;
    }


    // Used for priority field while creating a new ticket
    public Priority definePriority(int attempt) {
        // In case of wrong inputs default value is "medium"
        if (attempt >= 3) {
            return Priority.MEDIUM;
        }

        String priorityChoice = Input.inputString("Low/Medium/High");

        // Validation of the input. Method recursion for valid input
        if (!priorityChoice.equalsIgnoreCase("LOW")
                && !priorityChoice.equalsIgnoreCase("MEDIUM")
                && !priorityChoice.equalsIgnoreCase("HIGH")) {
            return definePriority(++attempt); // recursive call of method itself for invalid inputs
        }
        return Priority.valueOf(priorityChoice.toUpperCase());
    }


    // Get all details of the stored tickets
    public void getTickets(){
        for (int i = 0; i < ticketList.size(); i++) {
            Ticket ticket = ticketList.get(i);
            System.out.println(ticket.getAllDetails());
        }
    }


    // View tickets by filtered status field
    public void viewByStatus(){
        String statusFilter = Input.inputString("Open/Pending/Closed/In_Progress/Rejected");

        try {
            Status status = Status.valueOf(statusFilter.toUpperCase());
            boolean ticketFound = false;
            for (int i = 0; i < ticketList.size(); i++) {
                Ticket ticket = ticketList.get(i);
                if (ticket.getStatus() == status) {
                    System.out.println(ticket.getAllDetails());
                    ticketFound = true;
                }
            }
            if (!ticketFound) {
                System.out.println("No ticket with status: " + status);
            }
        }catch (IllegalArgumentException e){
            System.out.println("Invalid. Please try one of the given statuses only.");
        }
    }


    // View tickets by filtered priority field
    public void viewByPriority(){
        String priorityFilter = Input.inputString("Low/Medium/High");

        try {
            Priority priority = Priority.valueOf(priorityFilter.toUpperCase());
            boolean ticketFound = false;
            for (int i = 0; i < ticketList.size(); i++) {
                Ticket ticket = ticketList.get(i);
                if (ticket.getPriority() == priority) {
                    System.out.println(ticket.getAllDetails());
                    ticketFound = true;
                }
            }
            if (!ticketFound) {
                System.out.println("No ticket with status: " + priority);
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Invalid. Please try one of the given options only.");
        }
    }

    // Update the status of any preferred ticket
    public void updateTicketStatus(){
        int ticketId = Input.inputNumber("ID of ticket to be updated");
        Ticket ticket = ticketList.get(ticketId - 1);

        String statusChoice = Input.inputString("Enter new Status(Open/Pending/Closed/In_Progress/Rejected)");
        ticket.setStatus(Status.valueOf(statusChoice.toUpperCase()));
        handler.saveTickets(this); // save updated ticket details to the file
    }
}
