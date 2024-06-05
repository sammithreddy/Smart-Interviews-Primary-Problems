import java.io.*;
import java.util.*;

public class Generating_String_Permutations {
    public static void permutation(String p,String s,ArrayList<String> list)
    {
        if(s.isEmpty())
        {
            list.add(p);
            return ;
        }
        char ch=s.charAt(0);
        for(int i=0;i<=p.length();++i)
        {
            String f=p.substring(0,i)+ch+p.substring(i);
            permutation(f,s.substring(1),list);
        }
    }
    public static void print(ArrayList<String> ans,int t)
    {
        System.out.println("Test Case #"+t+":");
        for(String s:ans)
        {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x=1;
        while(t-->0)
        {
            String s=sc.next();
            ArrayList<String> ans=new ArrayList<>();
            permutation("",s,ans);
            Collections.sort(ans);
            print(ans,x);
            x++;
        }
    }
}