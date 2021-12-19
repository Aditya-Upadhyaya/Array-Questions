
public class ReArrangeSortedArray {
    static void Rearrange(int arr[], int n) {

       int min=0;
       int max=n-1;
       int m= arr[n-1]+1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
            arr[i]=arr[i]+((arr[max]%m)*m);
            max--;
            } else {    
                arr[i]=arr[i]+((arr[min]%m)*m);
                min++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]/m;
        }
        for (int i : arr) {
           
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1969 ,2677, 3142, 4631, 4764, 5748, 6476, 6487};
        int n = arr.length;
        Rearrange(arr, n);
    }
}
