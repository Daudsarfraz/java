 public class swap{
    public static void main(String[] args) {
        System.out.println("Wellcome to my Swap Tutorial.....");

        int a = 10;
        int b = 20;

        swap1(a,b);
        System.out.println(a + " Before swaped " + b);
;
    }
    static void swap1 (int a,int b){
        System.out.println("swap function called ");
        int temp = a;
        a = b ;
        b = temp;
        System.out.println(a + " swaped " + b);


    }




 }