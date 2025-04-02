import java.util.Scanner;

/**
 * @author Gibe
 */

public class EnumDemo {

    public void testFields() {
        Days mon = Days.MONDAY;
        System.out.println("The name of the day is: " + mon.getDayName());
        System.out.println("The number of the day is: " + mon.getDayNumber());
    }
    
    public void printDescription(Days day) {
        switch (day) { 
            case MONDAY: 
                System.out.println("Mondays are bad."); 
                break; 
            case FRIDAY: 
                System.out.println("Fridays are better."); 
                break; 
            case SATURDAY: 
            case SUNDAY: 
                System.out.println("Weekends are best!!!!!!!!"); 
                break; 
            default:  
                System.out.println("Midweek days are so-so."); 
                break;
        }

    }
    /*
     * -enums have a static valueOf method 
     * that takes a String as an argument,
     * and returns the corresponding enum object/constant 
     *
     */
    public void printWhatICanDo(String dayString) {
        Days day = Days.valueOf(dayString.toUpperCase());
        if (isWeekend(day)){
            System.out.println("I can sleep all the day!");
        }
        else{
            System.out.println("I have to get up at 6 o'clock");
        }
    }

    private boolean isWeekend(Days day) {
        return day == Days.SATURDAY || day == Days.SUNDAY;
    }

    /*
     * -enums have a static values method 
     * that returns an array containing 
     * all of the values of the enum in the order they are declared.
     * -Enumeration types have an ordinal() method 
     * that returns the numerical position of each enumeration constant 
     * in its class declaration. Avoid using ordinal(): it is error prone.
     * -The name() method returns the string representation of the enum constant.
     */
    public void printAllDays() {
        for (Days d : Days.values()) {
            System.out.println(d.ordinal() + " " + d.name());
        }
    }

}
