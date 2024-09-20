import java.io.*;
import java.util.*;

public class Checkboard_Pattern {
    public static void printBoard(String arr[][])
    {
        int n=arr.length;
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void checkBoard(int n)
    {
        n=2*n;
        String arr[][]=new String[n][n];
        boolean flag=true;
        for(int i=0;i<n;i=i+2)
        {
            if(flag)
            {
                String item="Star";
                for(int j=0;j<n;j=j+2)
                {
                    if(item=="Star")
                    {
                        arr[i][j]="*";
                        item="Dash";
                    }
                    else
                    {
                        arr[i][j]="-";
                        item="Star";
                    }
                }
                for(int j=1;j<n;j=j+2)
                {
                    arr[i][j]=arr[i][j-1];
                }
                for(int j=0;j<n;++j)
                {
                    arr[i+1][j]=arr[i][j];
                }
                flag=false;
            }
            else
            {
                String item="Dash";
                for(int j=0;j<n;j=j+2)
                {
                    if(item=="Star")
                    {
                        arr[i][j]="*";
                        item="Dash";
                    }
                    else
                    {
                        arr[i][j]="-";
                        item="Star";
                    }
                }
                for(int j=1;j<n;j=j+2)
                {
                    arr[i][j]=arr[i][j-1];
                }
                for(int j=0;j<n;++j)
                {
                    arr[i+1][j]=arr[i][j];
                }
                flag=true;
            }
        }
        printBoard(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=1;
        while(t-->0)
        {
            int n=sc.nextInt();
            System.out.println("Case #"+i+":");
            checkBoard(n);
            i++;
        }
    }
}