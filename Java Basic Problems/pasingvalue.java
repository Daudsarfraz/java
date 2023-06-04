public class pasingvalue {

    /*A parameter is a variable in the declaration of the function.
https://stackoverflow.com/questions/156767/whats-the-difference-between-an-argument-and-a-parameter
An argument is the actual value of the variable that gets passed to the function. */
    public static void main(String[] args) {
        int a = 5000;
        int b = 2000;
        int ans =  sum(a,b);

        System.out.println("Your sum is : " + ans);

    }
    static int sum(int x, int y){
        return x + y;
    }

}
