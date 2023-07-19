/**
 * This is a terminal-based simple ticket management system using Java,
 * where users can manage and track tickets.
 */

package HomePracticals.Lsn_24.main;

import HomePracticals.Lsn_24.model.FileHandler;
import HomePracticals.Lsn_24.model.TicketService;
import HomePracticals.Lsn_24.util.Input;

public class SystemMenu {
    public static void systemMenu() {
        TicketService service = new TicketService();
        FileHandler handler = new FileHandler();
        boolean exit = false;

        while (!exit) {
            int menu = Input.inputNumber("\n==== System MENU ===="
                    + "\n1. Create a New Ticket"
                    + "\n2. View all Tickets"
                    + "\n3. View by Status"
                    + "\n4. View by Priority"
                    + "\n5. Update Status"
                    + "\n6. Clear all Tickets"
                    + "\n7. Exit"
                    + "\nChoose menu to proceed");

            switch (menu) {
                case 1:
                    service.addTicket();
                    break;
                case 2:
                    service.getTickets();
                    break;
                case 3:
                    service.viewByStatus();
                    break;
                case 4:
                    service.viewByPriority();
                    break;
                case 5:
                    service.updateTicketStatus();
                    break;
                case 6:
                    handler.clearAllTickets(service);
                    break;
                case 7:
                    System.out.println("Terminating the program..");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
