import java.io.*;
import java.util.*;

public class Sum_With_Queries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            long sum=0;
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextInt();
                sum=sum+(long)arr[i];
            }
            int q=sc.nextInt();
            while(q-->0)
            {
                int i,j,x;
                i=sc.nextInt();
                j=sc.nextInt();
                x=sc.nextInt();
                sum=sum+(long)((long)(j-i+1)*(long)(x));
            }
            System.out.println(sum);
        }
    }
}