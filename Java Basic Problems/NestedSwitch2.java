import java.util.Scanner;
public class NestedSwitch2 {
    public static void main(String[] args) {
        System.out.println("Wellcome to Nested Switch...");
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String Department = sc.nextLine();
        sc.close();

    switch (empID) {
        case 1 -> System.out.println("Dawood");
        case 2 -> System.out.println("Ali ");
        case 3 ->{
            switch (Department) {
                case "BSCS" -> System.out.println("Well come to BSCS");    
                case "BSSE" -> System.out.println("Wellcome to BSSE");
                default -> System.out.println("No Department Found");
            }
        }
                
            
            case 4 -> System.out.println("Salman");
            default -> System.out.println("Record NOT FOUND....");
        }
    
    }
}


    


