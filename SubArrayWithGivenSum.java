import java.util.*;
public class SubArrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        int flag=0;
        int j=0;
        int sum=0;
        int support=0;
       end: for(int i = 0; i < n-1 ; i++)
        {
            if(flag==0 && i<n-2){
                j=i+1;}

            if (flag==1) {
                i=support;
                sum=sum+arr[j];
            }
            else{
                sum=sum+arr[i]+arr[j];
            } 
            if (sum>s) {
                flag=0;
                sum=0;
                continue;
            }   
           if(sum==s)
            {
                al.add(i+1);
                al.add(j+1);
                break;
            }
            else
            {
                if(i<n-2 && j<n-1){
                j++;
                flag=1;
                support=i;}
                else{
                    sum=0;
                    flag=0;
                    continue;
                }
                continue end;
            }
            
        }
        if (al.isEmpty()) {
            al.add(-1);
        }

        return al;
    }
    public static void main(String[] args) {
        int arr[]= {122,159 ,47 ,183, 82 ,145, 197, 23 ,130 ,162, 136 ,51 ,174, 67};
        int n=14;
        int s=1757;
        System.out.println(subarraySum(arr, n, s));
    }
}
