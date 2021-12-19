public class RemoveDuplicateAndReverse {
    public static void main(String[] args) {
        String str = "Infosys";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i+1; j < sb.length(); j++) {
                if (sb.charAt(i)==sb.charAt(j)) {
                    System.out.println(sb.charAt(j));
                    sb.deleteCharAt(j);
                }
            }
        }
        sb.reverse();
        System.out.println(sb);
        
    }
}
