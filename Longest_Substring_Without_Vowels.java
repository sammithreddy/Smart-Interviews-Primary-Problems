import java.io.*;
import java.util.*;

public class Longest_Substring_Without_Vowels {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        HashSet<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        while(t-->0)
        {
            String s=sc.next();
            int count=0,ans=0;
            for(int i=0;i<s.length();++i)
            {
                if(!vowels.contains(s.charAt(i)))
                {
                    count++;
                }
                else
                {
                    count=0;
                }
                ans=Math.max(ans,count);
            }
            System.out.println(ans);
        }
    }
}