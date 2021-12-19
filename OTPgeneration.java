
public class OTPgeneration {
    public static void main(String[] args) {
        long n =  5624381275L;
        StringBuilder sb = new StringBuilder(Long.toString(n));
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <sb.length(); i++) {
            if (i%2==0) {
                // System.out.print(sb.charAt(i));
                // sb.deleteCharAt(i);
            }
            else{
               
                s.append(sb.charAt(i));
            }
        }
        sb = null;
        // System.out.println(s);
        int arr[] = new int[s.length()];
        for (int i = 0; i < arr.length; i++) {
            char c =s.charAt(i);
            int p = Character.getNumericValue(c);
            arr[i]=p*p;
        }
        StringBuilder sd = new StringBuilder();
        int i = 0;
        while (sd.length()!=4) {
            sd.append(arr[i]);
            i++;
        }
        String sp = new String(sd);
        int otp = Integer.valueOf(sp);
        System.out.println(otp);

    }
}
