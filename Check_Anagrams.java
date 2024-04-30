import java.io.*;
import java.util.*;

public class Check_Anagrams {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a=sc.next();
            String b=sc.next();
            char[] A=a.toCharArray();
            char[] B=b.toCharArray();
            Arrays.sort(A);
            Arrays.sort(B);
            String aa=new String(A);
            String bb=new String(B);
            if(aa.equals(bb))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}