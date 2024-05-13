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
            for(int i=1;i<n;++i)
            {
                int j=i-1;
                int temp=arr[i];
                while(j>=0 && arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=temp;
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}