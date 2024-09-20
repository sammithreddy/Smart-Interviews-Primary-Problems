import java.io.*;
import java.util.*;

public class NQueens {
    static List<int[][]> solutions=new ArrayList<>();
    public static void print(int arr[][])
    {
        for(int i=0;i<arr.length;++i)
        {
            for(int j=0;j<arr.length;++j)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean canPlace(int arr[][],int row,int col)
    {
        for(int i=0;i<col;++i)
        {
            if(arr[row][i]==1)
            {
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j>=0 ;i--,j--)
        {
            if(arr[i][j]==1)
            {
                return false;
            }
        }
        for(int i=row,j=col;i<arr.length && j>=0 ; i++ , j--)
        {
            if(arr[i][j]==1)
            {
                return false;
            }
        }
        return true;
    }

    public static void solve(int arr[][],int col)
    {
        if(col>=arr.length)
        {
            int sol[][]=new int[arr.length][arr.length];
            for(int i=0;i<sol.length;++i)
            {
                for(int j=0;j<sol.length;++j)
                {
                    sol[i][j]=arr[i][j];
                }
            }
            solutions.add(sol);
            return;
        }
        for(int i=0;i<arr.length;++i)
        {
            if(canPlace(arr,i,col))
            {
                arr[i][col]=1;
                solve(arr,col+1);
                arr[i][col]=0;
            }
        }
    }
    public static void nqueen(int n)
    {
        int arr[][]=new int[n][n];
        solutions.clear();
        solve(arr,0);
        solutions.sort((a,b)->
        {
            for(int i=0;i<a.length;++i)
            {
                for(int j=0;j<a[i].length;++j)
                {
                    if(a[i][j]!=b[i][j])
                    {
                        return Integer.compare(b[i][j],a[i][j]);
                    }
                }
            }
            return 0;
        });
        for(int [][]ans:solutions)
        {
            print(ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            if(n==2 || n==3)
            {
                System.out.println(-1);
                System.out.println();
            }
            else
            {
                nqueen(n);
            }
        }
    }
}