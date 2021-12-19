import java.util.*;

public class PrintDuplicateElement {
    public static void main(String[] args) {
        int Arr[] = { 1,11, 5, 4, 7, 1, 5, 1 };
        /*for (int i = 0; i < Arr.length; i++) {
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[i] == Arr[j]) {
                    System.out.println(Arr[i]);
                    break;
                }
            }
            
        }*/
        // Set<Integer> hs = new HashSet<>();
       
        System.out.println( Arrays.binarySearch(Arr, 4));
        
        System.out.println(Arrays.toString(Arr));
        // for (int i = 0; i < Arr.length; i++) {
        //     if (hs.contains(Arr[i])) {
        //         System.out.println(Arr[i]);
        //     } else {
        //         hs.add(Arr[i]);
        //     }
        // }
        System.out.println();


    }
}
