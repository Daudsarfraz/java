import java.util.Scanner;
// Perimitive is a data type which you cannot break futher
// Wrapper class use for further functionalities
public class Input {
    public static void main(String[] args){
        /*System.out.println("Please Enter one Number");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();
        System.out.println("Your number is : " + num1);*/
    
        /* 
        System.out.println("Please Enter one Float");
        Scanner input2 = new Scanner(System.in);
        float flt = input2.nextFloat();
        System.out.println("Your number is : " + flt);
        */

        /* 
        System.out.println("Please Enter one String");
        Scanner input3 = new Scanner(System.in);
        String str = input3.next();
        System.out.println("Your number is : " + str);
        */
        System.out.println("Please enter one Character");
        Scanner input4 = new Scanner(System.in);
        char chr = input4.next().charAt(4);
        System.out.println("Char is : " + chr );
        input4.close();
        
    }

    
}
