import java.io.*;
import java.util.*;

public class Longest_Increasing_Subsequence {

    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       int t=Integer.parseInt(br.readLine());
       while(t-->0)
       {
           StringTokenizer s=new StringTokenizer(br.readLine());
           int n=Integer.parseInt(s.nextToken());
           int arr[]=new int[n];
           List<Integer> dp=new ArrayList<>();
           s=new StringTokenizer(br.readLine());
           for(int i=0;i<n;++i)
           {
               arr[i]=Integer.parseInt(s.nextToken());
               if(i==0)
               {
                   dp.add(arr[i]);
               }
               else
               {
                   if(arr[i]>dp.get(dp.size()-1))
                    {
                        dp.add(arr[i]);
                    }
                    else
                    {
                        int index=Collections.binarySearch(dp,arr[i]);
                        if(index<0)
                        {
                            index=-(index+1);
                        }
                        dp.set(index,arr[i]);
                    }
               }
           }
           bw.write(dp.size()+"\n");
       }
       bw.flush();
       bw.close();
    }
}