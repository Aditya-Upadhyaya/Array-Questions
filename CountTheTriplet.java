import java.util.*;

public class CountTheTriplet {
    static int Sol(int arr[], int n) {
        int count = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }

        while (!al.isEmpty()) {
            int max = al.get(al.size()-1);
            for (int i = 0; i < al.size() - 2; i++) {
                for (int j = i + 1; j < al.size() - 1; j++) {
                    if (arr[i] + arr[j] == max) {
                        count++;
                    }
                }

            }
            al.remove(al.size()-1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4};
        int n = 3;
        Arrays.sort(arr);
        int s = Sol(arr, n);
        System.out.println(s);

    }
}
