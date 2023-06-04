import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        System.out.println("Wellcome to VarArg...");
        int[] v = {1,2,3,5,6,7};
        fun(v);
        multiple(2_000,38_977,"Dawood","Chattha","FAST");
    }
    
    
    // passing multiple arguments to a function
    static void fun(int ...v){
        System.out.println(Arrays.toString(v) );
    }

    static void multiple(int a, int b, String v, String x, String z){
        System.out.println(a+ " " + b + " " +   v + " " +  x + " " + z);
    }
}
