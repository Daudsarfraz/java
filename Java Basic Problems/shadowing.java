public class shadowing{
    static int x = 50;
    static int c; //
    public static void main(String[] args) {
        
        System.out.println("Wellcome to Shadowing Class...");
        System.out.println(x);
        c = 800;
        int x = 200;
        System.out.println(x);
        System.out.println(c);
        fun();
    }
    static void fun(){
        System.out.println(x);
        System.out.println(c);
    }
    


}