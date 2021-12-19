import java.util.*;

public class DeleteDuplicateElement {
    public static void main(String[] args) {
        int Arr[] = { 1, 11, 5, 4, 7, 5, 1 };
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(Arr);
        for (int i = 0; i < Arr.length; i++) {
            int j = i + 1;
            if (j < Arr.length) {
                if (Arr[i] == Arr[j]) {
                    // System.out.println(Arr[i]);
                } else {
                    al.add(Arr[j-1]);
                }
            }
            else{
                al.add(Arr[i]);
            }
        }
       
        int arrNew[] = new int[al.size()];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i]=al.get(i);
        }
        
        Arr=arrNew;
        // for (int i : Arr) {
        //     System.out.println(i);
        // }
        arrNew=null;
        for (int i : Arr) {
            System.out.println(i);
        }
        
        
    }
}
