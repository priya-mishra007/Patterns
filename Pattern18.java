import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        System.out.print("Enter no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {

            int a = 1;

            for (int j = n - i; j >= 1; j--) {
                System.out.print(a);
                a++;
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" ");
                a++;
            }

            for (int l = n - i; l >= 1; l--) {
                System.out.print(a);
                a++;
            }

            System.out.println();
        }

        sc.close();
    }
}
