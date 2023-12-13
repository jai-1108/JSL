import java.util.Scanner;

public class Fact_Armstrong_Palin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, num;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Factorial");
            System.out.println("2. Test Armstrong");
            System.out.println("3. Test Palindrome");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    num = scanner.nextInt();
                    System.out.println("Factorial of " + num + " is " + factorial(num));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    num = scanner.nextInt();
                    if (testArmstrong(num)) {
                        System.out.println(num + " is an Armstrong number");
                    } else {
                        System.out.println(num + " is not an Armstrong number");
                    }
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    num = scanner.nextInt();
                    if (testPalindrome(num)) {
                        System.out.println(num + " is a Palindrome number");
                    } else {
                        System.out.println(num + " is not a Palindrome number");
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice, please choose again.");
            }
        } while (choice != 4);
    }

    private static long factorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static boolean testArmstrong(int num) {
        int sum = 0, temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, 3);
            temp /= 10;
        }
        return num == sum;
    }

    private static boolean testPalindrome(int num) {
        int reverse = 0, temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        return num == reverse;
    }
}