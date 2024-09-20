import java.io.*;
import java.util.*;

public class Exclusion_Product {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long mod=((long)1e9)+7;
            int n=sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextLong();
            }
            long prefix[]=new long[n];
            long suffix[]=new long[n];
            prefix[0]=arr[0];
            suffix[n-1]=arr[n-1];
            for(int i=1;i<n;++i)
            {
                prefix[i]=((prefix[i-1]%mod)*(arr[i]%mod))%mod;
            }
            for(int i=n-2;i>=0;i--)
            {
                suffix[i]=((suffix[i+1]%mod)*(arr[i]%mod))%mod;
            }
            arr[0]=suffix[1];
            arr[n-1]=prefix[n-2];
            for(int i=1;i<n-1;++i)
            {
                arr[i]=((prefix[i-1]%mod)*(suffix[i+1]%mod))%mod;
            }
            for(int i=0;i<n;++i)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}