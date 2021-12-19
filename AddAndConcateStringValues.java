import java.util.StringTokenizer;
public class AddAndConcateStringValues{
    public static void main(String[] args) {
        String str = "3,1,8,4,2,3,7,2";
        StringTokenizer st = new StringTokenizer(str, ",");
        StringBuilder s = new StringBuilder();
        while (st.hasMoreTokens()) {
            s.append(st.nextToken());
            
        }
        int posfour = 0;
        int posSeven = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '4') {
                posfour=i;
            }
            if (s.charAt(i)=='7') {
                posSeven = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = posfour; i <= posSeven; i++) {
            sb.append(s.charAt(i));
        } 
        String strnum2 = new String(sb);
        int num2 = Integer.valueOf(strnum2);
        System.out.println(num2);
        int num1=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='4' || s.charAt(i)=='7') {
                break;
            } else {
                char c =s.charAt(i);
                num1 = num1 + Character.getNumericValue(c);
            }
        }
        System.out.println(num1);
    
    }
}
