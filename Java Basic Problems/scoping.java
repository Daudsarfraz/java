public class scoping {
    public static void main(String[] args) {
        // scoping mean where we can access a variable
        System.out.println("Well come to scoping in Java.....");
int a = 50;
        int b = 100;
        System.out.println(a+ "    " +b);

        { // outside things can be use inside but inside cant outside
            System.out.println(a);
             a = 40; // initalized outside cant initialized again but can modify
            int c =  45; // initialied values will be remain in this block
                        // will not be use outside of the block
            System.out.println(c); 

        }
        
        System.out.println(a);
    }
    //
}
