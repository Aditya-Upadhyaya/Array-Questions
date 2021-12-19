import java.util.*;

public class SubArrayWithSumOrderOfnn {
    static ArrayList<Integer> subarraySumNN(int[] arr, int n, int s) {
        int sum = 0;
        int start=0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            sum = sum + arr[i];
            while (sum > s) {
                sum=sum-arr[start];
                start++;
            }
            if (sum == s) {
                al.add(start + 1);
                al.add(i + 1);
                break;
            }

        }

        if (al.isEmpty()) {
            al.add(-1);
        }

        return al;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
        int n = 10;
        int s = 15;
        System.out.println(subarraySumNN(arr, n, s));
    }
}
