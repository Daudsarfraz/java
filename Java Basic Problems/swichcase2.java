public class swichcase2 {
    public static void main(String[] args) {
        System.out.println("Well Come to Switch Case....");
        
        String fruit = "Apple";

        // without break
        switch(fruit){

           case "Apple" -> System.out.println("This is an Apple...");
            case "Mango" -> System.out.println("This is Mango...");
            case "Banana" -> System.out.println("This is Banana...");
            default -> System.out.println("Nothing Sorry....");

        }
    }
}
