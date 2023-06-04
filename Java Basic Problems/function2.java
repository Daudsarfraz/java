import java.util.Scanner;
public class function2 {
    public static void main(String[] args) {
        System.out.println("Well Come to Returning value in Function");
        int ans = sum2();
        System.out.println("Your anser is : "+ ans);

    }
    static int sum2(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please Enter 1st number");
        int no1 = sc.nextInt();
        System.out.println("Please enter Second NUmber");
        int no2 = sc.nextInt();
        sc.close();
        int sum = no1 + no2;
        //System.out.println("Your sum is : " + sum);

        return sum;
    }
    
}
