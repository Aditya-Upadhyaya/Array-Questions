public class SortArrayOf012 {
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,0,1,1,2};
        int arr2[] = new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                arr2[i]=arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
                arr2[count]=arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==2) {
                arr2[count]=arr[i];
                count++;
            }
        }
        // arr=arr2;

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
