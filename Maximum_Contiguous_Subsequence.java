import java.io.*;
import java.util.*;

public class Maximum_Contiguous_Subsequence{

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
            Arrays.sort(arr);
            int c=0,ans=0;
            for(int i=0;i<n-1;++i)
            {
                if(arr[i+1]-arr[i]==1)
                {
                    c++;
                    ans=Math.max(ans,c);
                }
                else if(arr[i+1]==arr[i])
                {
                    continue;
                }
                else
                {
                    c=0;
                }
            }
            System.out.println(ans+1);
        }
    }
}