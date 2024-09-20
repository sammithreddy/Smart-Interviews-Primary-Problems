import java.io.*;
import java.util.*;

public class Closing_Triplets {
    public static int[] max(int a,int b,int c)
    {
        //int ans[]=new int[2];
        if(a>=b && a>=c)
        {
            return new int[]{a,1};
        }
        else if(b>=c && b>=a)
        {
            return new int[]{b,2};
        }
        return new int[]{c,3};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;++i)
            {
                a[i]=sc.nextInt();
            }
            n=sc.nextInt();
            int b[]=new int[n];
            for(int i=0;i<n;++i)
            {
                b[i]=sc.nextInt();
            }
            n=sc.nextInt();
            int c[]=new int[n];
            for(int i=0;i<n;++i)
            {
                c[i]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            Arrays.sort(c);
            int i=a.length-1,j=b.length-1,k=c.length-1;
            int ans=Integer.MAX_VALUE;
            while(i>=0 && j>=0 && k>=0)
            {
                int arr[]=max(a[i],b[j],c[k]);
                ans=Math.min(arr[0]-Math.min(Math.min(a[i],b[j]),c[k]),ans);
                if(arr[1]==1)
                {
                    i--;
                }
                else if(arr[1]==2)
                {
                    j--;
                }
                else
                {
                    k--;
                }
            }
            System.out.println(ans);
        }
    }
}