import java.io.*;
import java.util.*;

public class Maximum_Subarray_Sum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int sum=0,ans=Integer.MIN_VALUE;
            int start=0,end=0,temp=0;
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;++i)
            {
                sum=sum+arr[i];
                if(sum>ans)
                {
                    ans=sum;
                    start=temp;
                    end=i;
                }
                if(sum<0)
                {
                    temp=i+1;
                    sum=0;
                }
            }
            System.out.println(ans+" "+start+" "+end);
        }
    }
}