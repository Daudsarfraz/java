public class dowhileloop {
    public static void main(String[] args) {
        System.out.println("Well come to Do While Loop...");

        /* Syntax of Do while loop
            do while loop execute at least once
         * do{
          
          // body
          
          } while (condition){
          
          // body
          
          increment / Decment
          
         * } 
         *           
         */

        int num = 0; 
         do{
            System.out.println("Your number is : " + num);
                num++;
         } while (num < 10);
    }
}
