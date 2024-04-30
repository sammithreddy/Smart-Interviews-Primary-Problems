import java.io.*;
import java.util.*;

public class Sort_0s_and_1s {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int zero=0;
            int one=0;
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextInt();
                if(arr[i]==0)
                {
                    zero++;
                }
                else
                {
                    one++;
                }
            }
            for(int i=0;i<n;++i)
            {
                if(i<zero)
                {
                    arr[i]=0;
                }
                else
                {
                    arr[i]=1;
                }
            }
            for(int i=0;i<n;++i)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}