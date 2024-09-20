import java.io.*;
import java.util.*;

public class Pair_With_Difference_K {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0)
       {
           int n=sc.nextInt();
           int k=sc.nextInt();
           int[] arr=new int[n];
           HashSet<Integer> map=new HashSet<>();
           boolean flag=false;
           for(int i=0;i<n;++i)
           {
               arr[i]=sc.nextInt();
               if(map.contains(arr[i]+k) || map.contains(arr[i]-k))
               {
                   flag=true;
               }
               else
               {
                   map.add(arr[i]);
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