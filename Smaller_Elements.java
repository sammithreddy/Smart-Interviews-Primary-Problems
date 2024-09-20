import java.io.*;
import java.util.*;

public class Smaller_Elements {
    static long count=0;
    static void mergeSort(int arr[],int s,int e)
    {
        if(s<e)
        {
            int  mid=(s+e)/2;
            mergeSort(arr,s,mid);
            mergeSort(arr,mid+1,e);
            merge(arr,s,mid,e);
        }
    }
    static void merge(int arr[],int s,int mid,int e)
    {
        int i=s,j=mid+1,k=0;
        int copy[]=new int[e-s+1];
        while(i<=mid && j<=e)
        {
            if(arr[i]<=arr[j])
            {
                copy[k]=arr[i];
                i++;
            }
            else
            {
                copy[k]=arr[j];
                count=count+(long)mid-(long)i+(long)1;
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            copy[k]=arr[i];
            k++;
            i++;
        }
        while(j<=e)
        {
            copy[k]=arr[j];
            k++;
            j++;
        }
        k=0;
        for(i=s;i<=e;++i)
        {
            arr[i]=copy[k];
            k++;
        }
    }
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
            mergeSort(arr,0,n-1);
            System.out.println(count);
            count=0;
        }
    }
}