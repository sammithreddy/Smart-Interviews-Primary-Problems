import java.io.*;
import java.util.*;

public class Number_Of_Anagramic_Groups {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            //int n,l;
            int n=sc.nextInt();
            int l=sc.nextInt();
            HashSet<String> map=new HashSet<String>();
            sc.nextLine();
            while(n-->0)
            {
                String s=sc.nextLine();
                char S[]=s.toCharArray();
                Arrays.sort(S);
                String ans=new String(S);
                map.add(ans);
            }
            System.out.println(map.size());
        }
    }
}