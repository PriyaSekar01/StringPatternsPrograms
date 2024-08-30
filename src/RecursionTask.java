import java.util.Scanner;

public class RecursionTask {
    public static int fact(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * fact(n - 1); // Recursive call: n! = n * (n-1)!
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number! I will find the factorial for you!!");
        int a = s.nextInt();
        int result = fact(a);
        System.out.println("Factorial of " + a + " is " + result);
    }
}
