import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Repeated_Numbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
            for(int i=0;i<n;++i)
            {
                int el=sc.nextInt();
                if(map.containsKey(el))
                {
                    int count=map.get(el);
                    count++;
                    map.put(el,count);
                }
                else
                {
                    map.put(el,1);
                }
            }
            for(Entry<Integer,Integer> entry:map.entrySet())
            {
                if(entry.getValue()==2)
                {
                    System.out.print(entry.getKey()+" ");
                }
            }
            System.out.println();
        }
    }
}