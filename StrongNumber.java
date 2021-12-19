import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int sum = 0;
        while (n != 0) {
            int fac = 1;
            int rem;
            rem = n % 10;
            for (int i = 1; i <= rem; i++) {
                fac = fac * i;
            }
            sum = sum + fac;
            n = n / 10;
        }
        System.out.println(sum);

        src.close();

    }
}
