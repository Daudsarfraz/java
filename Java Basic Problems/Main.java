
// public mean you can access this class from anywhere
// class is the name of properties and function if class is public class 
// class name should be same as file name
public class Main{

	// static bcz we want to run main function without creating object
	// of this class

	/* Main obj = new Main()
	obj.main(); creating an object but its will not execute bcz not 
	starting point of execution nothing is running before this
	 */

	// Void is the return type of the function
    public static void main(String[] args) {
		// we pass args during run of file in like javac Main.java
		// java Main Dawood Chattha
		// Args save collection of strings
	System.out.println(args[2]);
	}
}
  