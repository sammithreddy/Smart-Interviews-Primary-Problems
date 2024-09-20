import java.io.*;
import java.util.*;

public class First_Repeating_Character {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int n=s.length();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;++i)
            {
                int ans=Integer.MAX_VALUE;
                int j=n-1;
                while(i<j)
                {
                    if(s.charAt(j)==s.charAt(i))
                    {
                        ans=j;
                    }
                    j--;
                }
                if(ans<min)
                {
                    min=ans;
                }
                if(i==min)
                {
                    break;
                }
            }
            if(min<n)
            {
                System.out.println(s.charAt(min));
            }
            else
            {
                System.out.println(".");
            }
        }
    }
}