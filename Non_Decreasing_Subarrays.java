import java.io.*;
import java.util.*;

public class Non_Decreasing_Subarrays{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            long dp[]=new long[n];
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextInt();
                dp[i]=1;
            }
            for(int i=1;i<n;++i)
            {
                if(arr[i-1]<=arr[i])
                {
                    dp[i]=dp[i]+dp[i-1];
                }
            }
            long ans=0;
            for(int i=0;i<n;++i)
            {
                ans=ans+dp[i];
            }
            System.out.println(ans);

        }
    }
}