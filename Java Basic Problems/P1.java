public class P1 {
    public static void main(String args[]) {
        int x, y;
        x = 10;//from   w  ww .  ja va2 s . c  om
        y = 20;
        if (x < y) { // begin a block
            x = y;
            y = 0;
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        } // end of block
    }
}