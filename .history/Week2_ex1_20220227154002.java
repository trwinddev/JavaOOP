import java.util.Scanner;

public class Week2_ex1 {

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void sumFibonacci(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            while (fibonacci(i) < 100) {

                System.out.println(fibonacci(i) + " ");
                sum += fibonacci(i);
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumFibonacci(n);
    }
}