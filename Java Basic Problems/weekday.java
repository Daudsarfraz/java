import java.util.Scanner;
public class weekday {
   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();
    switch(day) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("Week_Days");
            break;

        case 6:
        case 7:
        System.out.println("Week_End....");
    }
    }
    
}
