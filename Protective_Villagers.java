import java.io.*;
import java.util.*;

public class Protective_Villagers {
    static boolean canDo(int mid,int arr[],int n,int k)
    {
        int pos=arr[0];
        int c=1;
        for(int i=1;i<n;++i)
        {
            if(arr[i]-pos>=mid)
            {
                pos=arr[i];
                c++;
                if(c==k)
                {
                    return true;
                }
            }
        }
        return false;
    }
    static int max(int arr[],int n,int k)
    {
        Arrays.sort(arr);
        int res=-1;
        int left=1,right=arr[n-1];
        while(left<right)
        {
            int mid=(left+right)/2;
            if(canDo(mid,arr,n,k))
            {
                res=Math.max(res,mid);
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return res;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0)
       {
           int n=sc.nextInt();
           int k=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;++i)
           {
               arr[i]=sc.nextInt();
           }
           System.out.println(max(arr,n,k));
       }
    }
}