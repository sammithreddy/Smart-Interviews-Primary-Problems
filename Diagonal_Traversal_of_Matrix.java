import java.io.*;
import java.util.*;

public class Diagonal_Traversal_of_Matrix {
    public static void print(int arr[][])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;++i)
        {
            int temp=i;
            int j=n-1;
            while(temp>=0)
            {
                sum=sum+arr[temp][j];
                temp--;
                j--;
            }
            System.out.print(sum+" ");
            sum=0;
        }
        for(int j=n-2;j>=0;j--)
        {
            int temp=j;
            int i=n-1;
            while(temp>=0)
            {
                sum=sum+arr[i][temp];
                temp--;
                i--;
            }
            System.out.print(sum+" ");
            sum=0;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0)
       {
           int n=sc.nextInt();
           int arr[][]=new int[n][n];
           for(int i=0;i<n;++i)
           {
               for(int j=0;j<n;++j)
               {
                   arr[i][j]=sc.nextInt();
               }
           }
           print(arr);
       }
    }
}