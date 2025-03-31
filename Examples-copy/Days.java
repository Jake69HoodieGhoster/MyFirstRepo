
/**
 * Enumeration class Days - an example enum with advanced functionality
 * 
 * @author Istvan Knoll
 * @version 2014-10-26
 * @author Gibe
 * @version Oct.2019
 */
public enum Days {
    THURSDAY(4, "Thursday"), 
    FRIDAY(5, "Friday"), 
    SATURDAY(6, "Saturday"), 
    MONDAY(1, "Monday"), //calls constructor with values 1 and "Monday"
    TUESDAY(2, "Tuesday"),  // arguments must match the parameter list in the constructor
    WEDNESDAY(3, "Wednesday"),
    SUNDAY(7, "Sunday")
    ; // semicolon needed when fields / methods follow

    /*
     *  Constants that hold the values. 
     *  Values are assigned before we use the enum, we can't change them.
     */
    private final int day;
    private final String name;

    public static final int WEEK_LENGTH = 7;

    /*
     * Constructor, which tells Java how to assign values to the fields in the enum.
     * The enum constructor must be either private or package scope (default)
     */
    Days(int day, String name) {  
        this.day = day;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " is day number " + day + " in the " + WEEK_LENGTH + " days long week.";
    }

    public String getDayName(){
        return name;
    }

    public int getDayNumber() {
        return day;
    }
}

