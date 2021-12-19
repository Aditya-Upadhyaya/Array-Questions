
public class MaxSumOfSubArray {
    static long SubArraySum(int arr[], int n) {

        long sum = arr[0];
        long max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > (arr[i] + max)) {
                max = arr[i];
            } else {
                max = max + arr[i];
            }
            sum = Math.max(sum, max);
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,-2,5 };
        int n = arr.length;
        System.out.println(SubArraySum(arr, n));
    }
}
