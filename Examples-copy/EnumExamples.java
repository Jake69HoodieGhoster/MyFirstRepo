
/**
 * Write a description of class EnumMethodsExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EnumExamples {

    public void demoIf(Weekdays day) {
        if (day == Weekdays.SUNDAY){
            System.out.println("I can sleep all the day!");
        }
        else{
            System.out.println("I have to get up at 6 o'clock");
        }
    }

    public void demoMethods() {
        Weekdays today = Weekdays.WEDNESDAY;

        System.out.println("Enum Name: " + today.name());  // "WEDNESDAY"
        System.out.println("Ordinal: " + today.ordinal()); // 2
        //System.out.println("Declaring Class: " + today.getDeclaringClass()); // class Day

        // Using values() with iteration
        for (Weekdays day : Weekdays.values()) {
            System.out.println(day);
        }

        // Converting String to Enum
        Weekdays friday = Weekdays.valueOf("friday");
        System.out.println("From String: " + friday); // "FRIDAY" (toString())
    }

    public void demoSwitch(Weekdays day) {

        switch(day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's weekend");
                break;
            case MONDAY:
                System.out.println("It's Monday");
                break;
            default:
                System.out.println("It's a working day");
                break;
        }
    }
    
    public void demoSwitchPrintDescription(Weekdays day) {
        switch (day) { 
            case MONDAY: 
                System.out.println("Mondays are bad."); 
                break; 
            case FRIDAY: 
                System.out.println("Fridays are better."); 
                break; 
            case SATURDAY: 
            case SUNDAY: 
                System.out.println("Weekends are best."); 
                break; 
            default:  
                System.out.println("Midweek days are so-so."); 
                break;
        }

    }
}
