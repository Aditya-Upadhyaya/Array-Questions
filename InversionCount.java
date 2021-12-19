public class InversionCount {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n= arr.length;
        int count =0 ;
        for (int i = 0; i < arr.length; i++) {
            int j=n-1;
            while (i<j) {
                if (arr[i]>arr[j]) {
                    count++;
                }
                j--;
            }
        }
        System.out.println("Count = "+ count);
    }
}
