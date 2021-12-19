import java.util.*;

public class ArrayOver {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        System.out.println("Enter Size");
        int n = src.nextInt();
        int arr[]={5,3,100,1,4};
        int A[]=new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i]=i+1;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        // for (int i = 0; i < A.length; i++) {
        //     int match=0;
        //     for (int j = 0; j < A.length; j++) {
        //         if (arr[i]==A[j]) {
        //             match=1;
        //             break;
        //         } 
                
        //     }
        //     if (match==0) {
        //         System.out.println(arr[i]);
        //     }
            
        // }
        src.close();
    }
}
