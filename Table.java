import java.util.Random;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        while (true) {
            System.out.print("array size for P×P array: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0)
                    break;
                else
                    System.out.println("array size should be greater");
            } else {
                System.out.println("Invalid input.");
                sc.next();
            }
        }
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (r.nextInt(8) + 1) * 2;
            }
        }
        System.out.println("\ngenerated 2D array:");
        System.out.print("    ");
        for (int i = 0; i < n; i++)
            System.out.printf("%5s", String.format("%02d", i));
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("   ");
            for (int j = 0; j < n; j++)
                System.out.print("+----");
            System.out.println("+");

            System.out.printf("%02d ", i);

            for (int j = 0; j < n; j++)
                System.out.printf("| %2d ", arr[i][j]);

            System.out.println("|");
        }
        System.out.print("   ");
        for (int j = 0; j < n; j++)
            System.out.print("+----");
        System.out.println("+");
        int num;
        while (true) {
            System.out.print("\nenter a number to highlight (even number 2-16): ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num >= 2 && num <= 16 && num % 2 == 0)
                    break;
                else
                    System.out.println("enter only even numbers between 2 and 16.");
            } else {
                System.out.println("invalid input.");
                sc.next();
            }
        }
        int count = 0;
        System.out.println("\nArray with " + num + " highlighted:");
        System.out.print("    ");
        for (int i = 0; i < n; i++)
            System.out.printf("%5s", String.format("%02d", i));
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("   ");
            for (int j = 0; j < n; j++)
                System.out.print("+----");
            System.out.println("+");
            System.out.printf("%02d ", i);
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == num) {
                    System.out.printf("|[%2d]", arr[i][j]);
                    count++;
                } else {
                    System.out.printf("| %2d ", arr[i][j]);
                }
            }
            System.out.println("|");
        }
        System.out.print("   ");
        for (int j = 0; j < n; j++)
            System.out.print("+----");
        System.out.println("+");
        System.out.println("\nnumber " + num + " appeared " + count + " time(s)");
        sc.close();
    }
}