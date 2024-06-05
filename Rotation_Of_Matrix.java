import java.io.*;
import java.util.*;

public class Rotation_Of_Matrix {
    public static void print(int arr[][],int t)
    {
        System.out.println("Test Case #"+t+":");
        for(int i=0;i<arr.length;++i)
        {
            for(int j=0;j<arr[0].length;++j)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x=1;
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[][]=new int[n][n];
            int copy[][]=new int[n][n];
            for(int i=0;i<n;++i)
            {
                for(int j=0;j<n;++j)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int j=0;j<n;++j)
            {
                for(int i=n-1;i>=0;--i)
                {
                    copy[j][n-i-1]=arr[i][j];
                }
            }
            print(copy,x);
            ++x;
        }
    }
}