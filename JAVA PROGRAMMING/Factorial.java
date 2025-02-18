// Q17..Find factorial of a number.
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial: " + fact);
        sc.close();
    }
}
