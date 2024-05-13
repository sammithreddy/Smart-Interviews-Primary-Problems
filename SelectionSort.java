import java.io.*;
import java.util.*;

public class Main {

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
            int j=n-1;
            while(j>0)
            {
                int max=arr[j];
                int maxloc=j;
                for(int i=j;i>=0;--i)
                {
                    if(arr[i]>=max)
                    {
                        max=arr[i];
                        maxloc=i;
                    }
                }
                if(maxloc!=j)
                {
                    int temp=arr[j];
                    arr[j]=max;
                    arr[maxloc]=temp;
                }
                System.out.print(maxloc+" ");
                j--;
            }
            System.out.println();
        }
    }
}