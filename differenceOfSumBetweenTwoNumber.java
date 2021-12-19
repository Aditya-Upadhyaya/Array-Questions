public class differenceOfSumBetweenTwoNumber {
    public static void main(String[] args) {
        int numUpto= 10;
        int numDivide = 3;
        int sumOfDivide=0;
        int sumOfNotDivide=0;
        int diff;
        for (int i = 1; i <= numUpto; i++) {
            if (i%numDivide==0) {
                sumOfDivide=sumOfDivide+i;
            } else {
                sumOfNotDivide=sumOfNotDivide+i;
            }
        }
        diff=sumOfNotDivide-sumOfDivide;
        System.out.println("Difference = "+diff);
    }
}
