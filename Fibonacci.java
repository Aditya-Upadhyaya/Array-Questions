import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 1;
            System.out.println("enter number");
            Scanner src = new Scanner(System.in);
            int n = src.nextInt();
            if (n > 5 && n <= 20) {
                System.out.print(a);
                System.out.print(" " + b);
                n = n - 2;
                int c;
                do {
                    c = a + b;
                    a = b;
                    b = c;
                    System.out.print(" " + c);
                    n--;
                } while (n > 0);

            } else {
                System.out.println("Invalid");

            }
            src.close();
        } catch (Exception e) {
            System.out.println("Invalid");
        }

        
    }
}
