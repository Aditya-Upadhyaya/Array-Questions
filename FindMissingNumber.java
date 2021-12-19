import java.util.*;
public class FindMissingNumber {
    static int findMiss(int arr[], int n){
        
        int num=0;
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        al.add(0);
        for (int i = 0; i < n; i++) {
            if (al.get(i)!=i+1) {
                num=i+1;
                break;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int arr[]={1};
        int n=2;
        System.out.println(findMiss(arr, n));
    }
}
