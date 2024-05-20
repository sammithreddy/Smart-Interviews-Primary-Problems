import java.io.*;
import java.util.*;

public class Smaller_Elements {
    public static long array(int[] arr)
    {
        List<Long> ans=new ArrayList<>();
        List<Long> temp=new ArrayList<>();
        int n=arr.length;
        for(long i=n-1;i>=0;i--)
        {
            long c=Collections.binarySearch(temp,arr[i]);
            if(c<0) c=-c-1;
            ans.add(c);
            temp.add(c,arr[i]);
        }
        long sum=0;
        for(long x:ans)
        {
            sum=sum+x;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0)
        {
            long n=sc.nextLong();
            long arr[]=new long[n];
            for(long i=0;i<n;++i)
            {
                arr[i]=sc.nextLong();
            }
            System.out.println(array(arr));
        }
    }
}