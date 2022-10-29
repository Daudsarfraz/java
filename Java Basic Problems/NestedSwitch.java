import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        System.out.println("Wellcome to Nested Switch...");
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String Department = sc.nextLine();
        sc.close();

        switch (empID) {
            case 1:
                System.out.println("Dawood");
                break;
            case 2:
                System.out.println("Ali ");
                switch (Department) {
                    case "BSCS":
                        System.out.println("Well come to BSCS");    
                        break;
                    case "BSSE":
                        System.out.println("Wellcome to BSSE");
                    default:
                        System.out.println("No Department Found");
                }
                break;
            case 3:
                System.out.println("Salman");
                break;
            default:
            System.out.println("Record NOT FOUND....");
                break;
        }


    }
    
}
