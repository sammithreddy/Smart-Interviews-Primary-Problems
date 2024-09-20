import java.io.*;
import java.util.*;

public class Maximum_Element_With_Queries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextInt();
            }
            int dp[]=new int[n];
            int q=sc.nextInt();
            while(q-->0)
            {
                int i,j,x;
                i=sc.nextInt();
                j=sc.nextInt();
                x=sc.nextInt();
                if(j<n-1)
                {
                    dp[j+1]=dp[j+1]-x;
                }
                dp[i]=dp[i]+x;
            }
            for(int i=1;i<n;++i)
            {
                dp[i]=dp[i-1]+dp[i];
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;++i)
            {
                max=Math.max(arr[i]+dp[i],max);
            }
            System.out.println(max);
        }
    }
}