public class NumberOfPairs {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        int arr1[]={1,2,3};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (Math.pow(arr[i], arr1[j]) > Math.pow(arr1[j], arr[i])) {
                    count++;
                }
            }
        }
        System.out.println("Count = "+ count);
    }
}
