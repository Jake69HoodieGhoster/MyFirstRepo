/**
 * An example with a switch statement
 * 
 * @author István Knoll
 * @version 2014-10-22
 */
public class SwitchExample {
    public void switchExample(int variable) {
        switch(variable) {
            case 0:
                System.out.println("    You said nothing");
                break;
            case 1:
            case 2:
                System.out.println("    One or two, I don't know");
                break;
            case 4:
                System.out.println("    You said four");
            case 5:
                System.out.println("    Four or five...");
                break;
            default:
                System.out.println("    I have no case for this, this is \"default\" (" + variable + ")" );
                break;
        }
    }
    
    public void runTest() {
        for(int i = -2; i < 8; i++) {
            System.out.println("Calling switchExample(" + i + ")");
            switchExample(i);
            System.out.println();
        }
    }
}
