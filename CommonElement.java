import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CommonElement {
    public static void main(String[] args) {
        int arr1[] = { 1, 5, 10, 20, 40, 80 };
        int arr2[] = { 6, 7, 20, 80, 100 };
        int arr3[] = { 3, 4, 15, 20, 30, 70, 120 ,20};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    al.add(arr1[i]);
                }
            }
        }
        Iterator<Integer> it = al.iterator();
        Set<Integer> s = new HashSet<>();

        while (it.hasNext()) {
            int n = it.next();
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] == n) {
                    s.add(arr3[i]);
                }
            }
        }
        System.out.println(s);

    }
}
