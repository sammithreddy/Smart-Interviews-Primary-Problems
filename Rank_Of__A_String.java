import java.io.*;
import java.util.*;

public class Rank_Of__A_String {
    public static long fact(long n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        long ans=1;
        for(int i=1;i<=n;++i)
        {
            ans=ans*i;
        }
        return ans;
    }
    public static long rankOfString(String s)
    {
        List<Character> ch=new ArrayList<>();
        for(int i=0;i<s.length();++i)
        {
            ch.add(s.charAt(i));
        }
        long n=s.length();
        Collections.sort(ch);
        HashSet<Character> map=new HashSet<>();
        long rank=0;
        for(long i=0;i<n;++i)
        {
            map.add(s.charAt((int)i));
            int index=Collections.binarySearch(ch,s.charAt((int)i));
            long count=0;
            for(int j=index-1;j>=0;j--)
            {
                if(!map.contains(ch.get(j)))
                {
                    count++;
                }
            }
            rank=rank+(fact(n-i-1)*count);
        }
        return rank+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            System.out.println(rankOfString(s));
        }
    }
}