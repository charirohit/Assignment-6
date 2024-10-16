/**
 * Represents an educational institute with details such as name, city, state, 
 * ministry, and the act under which it was established.
 * This class provides constructors to initialize the institute object and 
 * methods to access and display the institute's details.
 * 
 * @author Rohit Chari
 * @RollNo 09
 * @version 1.0
 * @since 17 July 2024
 * @modified 31 July 2024
 */
public class Institute {

    private String instituteName;
    private String city;
    private String state;
    private String ministry;
    private String act;

    /**
     * Default constructor that initializes an institute with empty values.
     */
    public Institute() {
        this.instituteName = "";
        this.city = "";
        this.state = "";
        this.ministry = "";
        this.act = "";
    }

    /**
     * Constructor that initializes the institute with the specified name.
     * 
     * @param name The name of the institute.
     */
    public Institute(String name) {
        this.instituteName = name;
        this.city = "";
        this.state = "";
        this.ministry = "";
        this.act = "";
    }

    /**
     * Constructor that initializes the institute with the specified name, city, and state.
     * 
     * @param name The name of the institute.
     * @param city The city where the institute is located.
     * @param state The state where the institute is located.
     */
    public Institute(String name, String city, String state) {
        this.instituteName = name;
        this.city = city;
        this.state = state;
        this.ministry = "";
        this.act = "";
    }

    /**
     * Constructor that initializes the institute with all specified details.
     * 
     * @param name The name of the institute.
     * @param city The city where the institute is located.
     * @param state The state where the institute is located.
     * @param act The act under which the institute was established.
     * @param ministry The ministry responsible for the institute.
     */
    public Institute(String name, String city, String state, String act, String ministry) {
        this.instituteName = name;
        this.city = city;
        this.state = state;
        this.ministry = ministry;
        this.act = act;
    }

    /**
     * Returns the name of the institute.
     * 
     * @return The name of the institute.
     */
    public String getName() {
        return this.instituteName;
    }

    /**
     * Returns the city where the institute is located.
     * 
     * @return The city where the institute is located.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Returns the state where the institute is located.
     * 
     * @return The state where the institute is located.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Returns the ministry responsible for the institute.
     * 
     * @return The ministry responsible for the institute.
     */
    public String getMinistry() {
        return this.ministry;
    }

    /**
     * Returns the act under which the institute was established.
     * 
     * @return The act under which the institute was established.
     */
    public String getAct() {
        return this.act;
    }

    /**
     * Displays the details of the institute.
     */
    public void display() {
        System.out.println("=======================================================");
        System.out.println("Institute Name : " + this.getName());
        System.out.println("City : " + this.getCity());
        System.out.println("State : " + this.getState());
        System.out.println("Ministry : " + this.getMinistry());
        System.out.println("Act : " + this.getAct());
        System.out.println("=======================================================");
    }
}
