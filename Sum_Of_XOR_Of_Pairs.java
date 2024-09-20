import java.io.*;
import java.util.*;

public class Sum_Of_XOR_Of_Pairs {

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
            long ans=0;
            for(int b=0;b<=20;++b)
            {
                long c=0;
                for(int i=0;i<n;++i)
                {
                    if((arr[i]&(1<<b))!=0)
                    {
                        c++;
                    }
                }
                ans=ans+(c*(n-c)*(1L<<b));
            }
            System.out.println(ans*2);
        }
    }
}