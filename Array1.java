import java.util.Scanner;

public class Array1 {
    public static void print(int arr[], int n)
    {
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                System.out.print(arr[i] + "  ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        int t=src.nextInt();
        int A[]=new int[t];
        for (int i = 0; i < A.length; i++) {
            A[i]=src.nextInt();
        }
        print(A, t);
        src.close();
        
    }
}
