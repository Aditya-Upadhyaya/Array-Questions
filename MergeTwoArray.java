import java.util.*;
public class MergeTwoArray {
    static void MergeArray(long arr1[], long arr2[], int n, int m){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
          int i=0,j=0,k=0;
          


          long C[]= new long[n+m];
          while (i<arr1.length && j< arr2.length) {
              if (arr1[i]<arr2[j]) {
                  C[k++]=arr1[i++];
              } else {
                C[k++]=arr2[j++];
              }
          }
          for (; i < arr1.length; i++) {
              C[k++]=arr1[i];
          }
          for (; j < arr2.length; j++) {
            C[k++]=arr2[j];
        }
        int count=0;
        for (int l = 0; l < arr1.length; l++) {
            arr1[l]=C[l];
            count++;
        }
        for (int l = 0; l < arr2.length; l++) {
            arr2[l]=C[count];
            count++;
        }
          for (long l : arr1) {
            System.out.print(l);
          }
          System.out.println();
          for (long l : arr2) {
            System.out.print(l);
          }
          
          
    }

    public static void main(String[] args) {
        long arr1[]={1 ,3 ,5 ,7};
        long arr2[]={0 ,2, 6, 8, 9};
        int n=arr1.length;
        int m =arr2.length;
        MergeArray(arr1, arr2, n, m);
    }
}
