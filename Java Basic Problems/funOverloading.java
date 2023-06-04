import java.util.Arrays;

public class funOverloading { 
    // Function overloading happens two or more functions with same name
    // they can exit if parameters are different or number of parameteres are different
    // it decide on compile time that which function have to run
    public static void main(String[] args) {
        System.out.println("Well come to Function Overloading...");
        int b = 10000;
        fun(b);
        String naam = "Dawood";
        fun(naam);
        sum(2,3,4);
        sum(12,12,12,12);
        sum(2,3453,34535,5353,353,5345,34534,53);
    }
    static void fun(int a){
        System.out.println(a);

    }
    
    static void fun(String name){
        System.out.println(name);

    }

    static void sum(int a, int b, int c){
        System.out.println("First");
        System.out.println(a+b+c);
    }

    static void sum(int a, int b, int c, int d){
        System.out.println("Second");
        System.out.println(a+b+c+d);
    }

    static void sum(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
