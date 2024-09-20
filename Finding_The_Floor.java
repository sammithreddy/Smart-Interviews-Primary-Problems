import java.io.*;
import java.util.*;

public class Finding_The_Floor {
    static int bs(int arr[],int k)
    {
        if(k<arr[0])
        {
            return Integer.MIN_VALUE;
        }
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(arr[mid]==k)
            {
                return arr[mid];
            }
            if(arr[mid]<k)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return arr[e];
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;++i)
       {
           arr[i]=sc.nextInt();
       }
       Arrays.sort(arr);
       int q=sc.nextInt();
       for(int i=0;i<q;++i)
       {
           int target=sc.nextInt();
           System.out.println(bs(arr,target));
       }
    }
}