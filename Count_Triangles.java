import java.io.*;
import java.util.*;

public class Count_Triangles {
    public static boolean isTriangle(int a,int b,int c)
    {
        return (a+b)>c && (b+c)>a && (a+c)>b;
    }
    public static int binarySearch(int arr[],int s,int target)
    {
        int e=arr.length-1;
        int mid=(s+e)/2;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(arr[mid]==target)
            {
                e=mid-1;
            }
            else if(target<arr[mid])
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return e;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int T=0;T<t;++T)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.parallelSort(arr);
            int count=0;
            for(int i=0;i<n;++i)
            {
                for(int j=i+1;j<n;++j)
                {
                    if(j!=n-1 && !isTriangle(arr[i],arr[j],arr[j+1]))
                    {
                        break;
                    }
                    int index=binarySearch(arr,j+1,arr[i]+arr[j]);
                    count=count+(index-j);
                }
            }
            System.out.println(count);
        }
    }
}