public class StarrPattern {
    public static void main(String[] args) {
        int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if ((i + j) > n) {
        // System.out.print(j+" ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.print("\n");
        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");

                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }

    }
}
