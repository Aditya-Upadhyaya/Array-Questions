public class BinaryString {
    public static void main(String[] args) {
        String str = "0C1A1B1C1C1B0A0";
        char c[] = new char[str.length()];
        c = str.toCharArray();
        int sum= Character.getNumericValue(c[0]);
        for (int i = 1; i < c.length; i = i + 2) {
            if (c[i] == 'C') {
                sum = sum ^ Character.getNumericValue(c[i+1]);
            }
            if (c[i] == 'A') {
                sum = sum & Character.getNumericValue(c[i+1]);
            }
            if (c[i] == 'B') {
                sum = sum | Character.getNumericValue(c[i+1]);
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println();
        
    }

}
