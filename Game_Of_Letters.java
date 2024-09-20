import java.io.*;
import java.util.*;

public class Game_Of_Letters {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0)
       {
           int count[]=new int[26];
           String s=sc.next();
           for(int i=0;i<s.length();++i)
           {
               count[s.charAt(i)-97]++;
           }
           int ans=0;
           for(int i=0;i<26;++i)
           {
               ans=ans^count[i];
           }
           if(ans==0)
           {
               System.out.println("Banta");
           }
           else
           {
               System.out.println("Santa");
           }
       }
    }
}