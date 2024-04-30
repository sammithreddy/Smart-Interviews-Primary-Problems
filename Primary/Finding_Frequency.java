import java.io.*;
import java.util.*;

public class Finding_Frequency {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;++i)
        {
            int key=sc.nextInt();
            if(map.containsKey(key))
            {
                int val=map.get(key);
                val++;
                map.put(key,val);
            }
            else
            {
                map.put(key,1);
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;++i)
        {
            int key=sc.nextInt();
            if(map.get(key)!=null)
            {
                System.out.println(map.get(key));
            }
            else
            {
                System.out.println(0);
            }
        }
    }
}