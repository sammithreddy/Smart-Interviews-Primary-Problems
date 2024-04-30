import java.io.*;
import java.util.*;

public class Words_Vowels_and_Consonants {
    public static int vowels(String s)
    {
        int count=0;
        HashSet<Character> v=new HashSet<>();
        String V="aeiouAEIOU";
        for(int i=0;i<V.length();++i)
        {
            v.add(V.charAt(i));
        }
        for(int i=0;i<s.length();++i)
        {
            if(v.contains(s.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        int x=t;
        while(t-->=0)
        {
            String in=sc.nextLine();
            if(t+1==x)
            {
                continue;
            }
            StringTokenizer s=new StringTokenizer(in);
            int word=0;
            int vowel=0;
            int cons=0;
            while(s.hasMoreTokens())
            {
                String w=new String(s.nextToken());
                vowel=vowel+vowels(w);
                cons=cons+(w.length()-vowels(w));
                word++;
            }
            System.out.println(word+" "+vowel+" "+cons);
        }
    }
}