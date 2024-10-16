import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class manages a list of institutes and provides functionality 
 * to display, search, and add institutes through a console-based menu.
 * 
 * @author Rohit Chari
 * @RollNo 09
 * @version 1.0
 * @since 17 July 2024
 * @modified 31 July 2024
 */
public class StartInstitute {

    /**
     * List to store the institutes.
     */
    private static final List<Institute> institutes = new ArrayList<>();

    /**
     * The main method of the class which provides a menu-driven interface 
     * for interacting with the list of institutes.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        // Initializing the list with some institutes
        institutes.add(new Institute("Aligarh Muslim University", "Aligarh", "Uttar Pradesh", 
            "Entry No. 63, Union list - The 7th schedule under Article 246 of the Constitution of India", 
            "Ministry of Education"));
        institutes.add(new Institute("Banaras Hindu University", "Varanasi", "Uttar Pradesh", 
            "Entry No. 63, Union list - The 7th schedule under Article 246 of the Constitution of India", 
            "Ministry of Education"));
        institutes.add(new Institute("University of Delhi", "Delhi", "Delhi", 
            "Entry No. 63, Union list - The 7th schedule under Article 246 of the Constitution of India", 
            "Ministry of Education"));
        institutes.add(new Institute("Atal Bihari Vajpayee Indian Institute of Information Technology and Management, Gwalior", 
            "Gwalior", "Madhya Pradesh",
            "The Indian Institutes of Information Technology Act, 2014 and their subsequent amendments", 
            "Ministry of Education"));
        institutes.add(new Institute("Indian Institute of Information Technology, Allahabad", 
            "Allahabad", "Uttar Pradesh", 
            "The Indian Institutes of Information Technology Act, 2014 and their subsequent amendments", 
            "Ministry of Education"));

        do {
            System.out.println("=======================================================");
            System.out.println("PRESS");
            System.out.println("1. To Display all Institutes");
            System.out.println("2. To Search an Institute");
            System.out.println("3. To Add a New Institute");
            System.out.println("0. To Exit");
            System.out.println("=======================================================");
            choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    displayAllInstitutes();
                    break;
                case 2:
                    searchInstitute(sc);
                    break;
                case 3:
                    addNewInstitute(sc);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }

    /**
     * Displays all institutes in the list.
     */
    private static void displayAllInstitutes() {
        if (institutes.isEmpty()) {
            System.out.println("No institutes available.");
        } else {
            for (Institute inst : institutes) {
                inst.display();
            }
        }
    }

    /**
     * Provides a menu for searching institutes by various criteria.
     * 
     * @param scanner The Scanner object used for user input.
     */
    private static void searchInstitute(Scanner scanner) {
        System.out.println("PRESS");
        System.out.println("1. To Search by Name");
        System.out.println("2. To Search by City");
        System.out.println("3. To Search by State");
        System.out.println("0. To Exit");
        int searchChoice = scanner.nextInt();
        scanner.nextLine(); 

        switch (searchChoice) {
            case 1:
                System.out.println("Enter name of the institute to search:");
                String name = scanner.nextLine();
                searchByName(name);
                break;
            case 2:
                System.out.println("Enter the city:");
                String city = scanner.nextLine();
                searchByCity(city);
                break;
            case 3:
                System.out.println("Enter the state:");
                String state = scanner.nextLine();
                searchByState(state);
                break;
            case 0:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    /**
     * Searches and displays institutes by their name.
     * 
     * @param name The name of the institute to search for.
     */
    private static void searchByName(String name) {
        boolean found = false;
        for (Institute inst : institutes) {
            if (inst.getName().equalsIgnoreCase(name)) {
                inst.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Institute not found.");
        }
    }

    /**
     * Searches and displays institutes by their city.
     * 
     * @param city The city of the institute to search for.
     */
    private static void searchByCity(String city) {
        boolean found = false;
        for (Institute inst : institutes) {
            if (inst.getCity().equalsIgnoreCase(city)) {
                inst.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Institute not found.");
        }
    }

    /**
     * Searches and displays institutes by their state.
     * 
     * @param state The state of the institute to search for.
     */
    private static void searchByState(String state) {
        boolean found = false;
        for (Institute inst : institutes) {
            if (inst.getState().equalsIgnoreCase(state)) {
                inst.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Institute not found.");
        }
    }

    /**
     * Adds a new institute to the list based on user input.
     * 
     * @param scanner The Scanner object used for user input.
     */
    private static void addNewInstitute(Scanner scanner) {
        System.out.println("Enter the name of the institute:");
        String name = scanner.nextLine();
        System.out.println("Enter City of the institute:");
        String city = scanner.nextLine();
        System.out.println("Enter State of the institute:");
        String state = scanner.nextLine();
        System.out.println("Enter Act of the institute:");
        String act = scanner.nextLine();
        System.out.println("Enter Ministry of the institute:");
        String ministry = scanner.nextLine();

        Institute newInstitute = new Institute(name, city, state, act, ministry);
        institutes.add(newInstitute);
        System.out.println("New institute added successfully.");
    }
}
