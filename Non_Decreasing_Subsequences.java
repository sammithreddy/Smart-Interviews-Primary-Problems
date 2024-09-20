import java.io.*;
import java.util.*;

public class Non_Decreasing_Subsequences {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long mod=(long)1e9+7;
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            long dp[]=new long[n];
            for(int i=0;i<n;++i)
            {
                dp[i]=1;
                arr[i]=sc.nextInt();
            }
            for(int i=1;i<n;++i)
            {
                for(int j=0;j<i;++j)
                {
                    if(arr[j]<=arr[i])
                    {
                        dp[i]=((dp[i]%mod)+(dp[j]%mod))%mod;
                    }
                }
            }
            long ans=0;
            for(int i=0;i<n;++i)
            {
                ans=((ans%mod)+(long)dp[i])%mod;
            }
            System.out.println(ans);
        }
    }
}