import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        System.out.print("Enter no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half
        for(int i = 1; i <= n; i++) {

            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k);
            }

            System.out.println();
        }

        // Lower half
        for(int i = n - 1; i >= 1; i--) {

            for(int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k);
            }

            System.out.println();
        }

        sc.close();
    }
}
