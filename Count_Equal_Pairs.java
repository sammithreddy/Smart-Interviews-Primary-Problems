import java.io.*;
import java.util.*;

public class Count_Equal_Pairs {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            //HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;++i)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;++i)
            {
                b[i]=sc.nextInt();
                //map.put(b[i],i);
            }
            int count=0;
            for(int i=0;i<n;++i)
            {
                for(int j=i+1;j<n;++j)
                {
                    if(a[i]==b[j] && a[j]==b[i])
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}