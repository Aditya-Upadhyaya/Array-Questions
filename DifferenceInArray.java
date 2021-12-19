public class DifferenceInArray {
    public static void main(String[] args) {
        int arr[]= {12,3,14,56,77,13};
        int diff=2;
        int num=13;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i]-num;
            int s;
            if (n<0) {
                s=(-n);
            }
            else{
                s=n;
            }
            if (s<=diff || s==0) {
                sum++;
            }
        }
        System.out.println("Sum = "+sum);
    
    }
}
