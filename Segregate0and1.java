// import java.util.Arrays;

public class Segregate0and1 {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0,0,1,0,1};
        // Arrays.sort(arr);
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                arr[j]=arr[i];
                j++;
            }
        }
        while (j<arr.length) {
            arr[j++]=1;
        }
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        
    
    }
}
