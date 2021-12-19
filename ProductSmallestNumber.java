import java.util.Arrays;

public class ProductSmallestNumber {
    public static void main(String[] args) {
        int arr[] = {5,2,4,3,9,7,1};
        int sum=9;
        int pair =0;
        Arrays.sort(arr);  //{1,2,3,4,5,7,9}
        if (arr[0] +arr[1]<=sum) {
            pair = arr[0]*arr[1];
        }

        System.out.println("Pair = " +pair);
    }
}
