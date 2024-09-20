import java.io.*;
import java.util.*;

public class First_Missing_Positive_Integer {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0)
       {
           int n=sc.nextInt();
           int arr[]=new int[n];
           HashSet<Integer> map=new HashSet<>();
           for(int i=0;i<n;++i)
           {
               arr[i]=sc.nextInt();
               if(arr[i]>0)
               {
                   map.add(arr[i]);
               }
           }
           int ans=0,i=1;
           while(true)
           {
               if(!map.contains(i))
               {
                   ans=i;
                   break;
               }
               i++;
           }
           System.out.println(ans);
       }
    }
}