import java.io.*;
import java.util.*;

public class Print_Hollow_Diamond_Pattern {
    public static void star()
    {
        System.out.print("*");
    }

    public static void space(int n)
    {
        for(int i=0;i<n;++i)
        {
            System.out.print(" ");
        }
    }

    public static void linechange()
    {
        System.out.println();
    }

    public static void pattern(int n,int t)
    {
        System.out.println("Case #"+t+":");
        int f=n/2;
        int s=1;
        while(f>=0)
        {
            if(f==(n/2))
            {
                space(f);
                star();
                f--;
            }
            else
            {
                space(f);
                star();
                space(s);
                star();
                f--;
                s=s+2;
            }
            linechange();
        }
        f=1;
        s=s-4;
        while(f<=(n/2))
        {
            if(f==(n/2))
            {
                space(f);
                star();
                f++;
            }
            else
            {
                space(f);
                star();
                space(s);
                star();
                f++;
                s=s-2;
            }
            linechange();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x=1;
        while(t-->0)
        {
            int n=sc.nextInt();
            pattern(n,x);
            x++;
        }
    }
}