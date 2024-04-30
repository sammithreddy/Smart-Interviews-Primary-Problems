import java.io.*;
import java.util.*;

public class Triplet_With_Sum_K {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int key=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            boolean flag=false;
            for(int i=0;i<n;++i)
            {
                int j=i+1;
                int k=n-1;
                while(j<k)
                {
                    if((arr[i]+arr[j]+arr[k])<key)
                    {
                        j++;
                    }
                    else if((arr[i]+arr[j]+arr[k])>key)
                    {
                        k--;
                    }
                    else
                    {
                        flag=true;
                        break;
                    }
                }
                if(flag==true)
                {
                    break;
                }
            }
            if(flag)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}