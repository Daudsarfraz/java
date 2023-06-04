public class stringswap {
    public static void main(String[] args) {
        System.out.println("String swap function...");
    
    String name = "Dawood";
    changeName(name);
    
    System.out.println("Your name is : " + name);

    }
    // Java has no pass by reference its have only pass by value
    // This will not sawp bcz  name pass as parameter is copy of name 
    // in function naam takes the copy of name so naam points also "Dawood"
    // that's why is will not change bcz naam is referencing chattha new object name point chattha
    // when we print name is prints Dawood 
    static void changeName(String naam){
        System.out.println("Function Called..");
        naam = "Chattha"; // not changing ceating a new object
        System.out.println(naam);
    }
    
}
