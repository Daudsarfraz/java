import java.util.Scanner;
public class weekday2 {
   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();

        // without break
    switch(day) {
        case 1,2,3,4,5 -> System.out.println("Week_Days");
        case 6,7 -> System.out.println("Week_End....");
    }
    }
    
}
