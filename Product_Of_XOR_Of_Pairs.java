import java.io.*;
import java.util.*;

public class Product_Of_XOR_Of_Pairs {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long mod=(int)1e9+7;
        while(t-->0)
        {
            int n=sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextLong();
            }
            long ans=1;
            for(int i=0;i<n;++i)
            {
                for(int j=i+1;j<n;++j)
                {
                    ans=((ans%mod)*(arr[i]^arr[j]))%mod;
                }
            }
            System.out.println(ans);
        }    
    }
}