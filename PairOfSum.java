// import java.util.ArrayList;
import java.util.Arrays;

public class PairOfSum {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 4, 3, 2, 4, 10, 3, 11, 5 };
        int sum = 7;
       /* ArrayList<Integer> al = new ArrayList<>(arr.length);
        al.add(0);
        al.add(0);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println((arr[i]) + " " + (arr[j]));
                    al.add(arr[i]);
                    al.add(arr[j]);
                }
            }
        }
        System.out.println(al);
        */
       Arrays.sort(arr);
       int low=0;
       int high = arr.length-1;
       while (low<high) {
           if (arr[low]+arr[high]<sum) {
               low++;
           } else if(arr[low]+arr[high]>sum) {
               high--;
           }
           else if (arr[low]+arr[high]==sum){
            System.out.println((arr[low]) + " " + (arr[high]));
            low++;
            high--;

           }
       }


    }
}
