package HomePracticals.Lsn_24.model;

import HomePracticals.Lsn_24.util.Priority;
import HomePracticals.Lsn_24.util.Status;

public class Ticket {
    private int id;
    private String title;
    private String description;
    private Status status;
    private Priority priority;
    public static int objCounter = 0;


    public Ticket(String title, String description, Priority priority, Status status) {
        this.id = ++objCounter;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getAllDetails() {
        return  this.getId()
                + ", " + this.getTitle()
                + ", " + this.getDescription()
                + ", " + this.getStatus()
                + ", " + this.getPriority();
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }


    // Convert Ticket object to a formatted string for storage
    public String toDataString() {
        return id + "," + title + "," + description + "," + status + "," + priority;
    }


    // Creating a Ticket object from the data string that is retrieved from the file
    public static Ticket fromDataString(String data) {
        String[] parts = data.split(",");
        int id = Integer.parseInt(parts[0]);
        String title = parts[1];
        String description = parts[2];
        Status status = Status.valueOf(parts[3]);
        Priority priority = Priority.valueOf(parts[4]);

        Ticket ticket = new Ticket(title, description, priority, status);
        ticket.id = id;
        return ticket;
    }

}
