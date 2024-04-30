import java.io.*;
import java.util.*;

public class Triple_Trouble {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
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
            for(Map.Entry<Integer,Integer> entry:map.entrySet())
                {
                    if(entry.getValue()==1)
                    {
                        System.out.println(entry.getKey());
                        break;
                    }
                }
        }
    }
}