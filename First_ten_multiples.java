import java.util.Scanner;

public class First_ten_multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer N:");
        int N = scanner.nextInt();

        System.out.println("First 10 multiples of " + N + ":");
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

        scanner.close();
    }
}