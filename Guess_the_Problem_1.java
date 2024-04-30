import java.io.*;
import java.util.*;

public class Guess_the_Problem_1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a,b;
            a=sc.next();
            b=sc.nextLine();
            HashSet<Character> map=new HashSet<>();
            for(int i=0;i<a.length();++i)
            {
                map.add(a.charAt(i));
            }
            String ans="";
            for(int i=1;i<b.length();++i)
            {
                if(map.contains(b.charAt(i)))
                {
                    continue;
                }
                ans=ans+b.charAt(i);
            }
            System.out.println(ans);
        }
    }
}