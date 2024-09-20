import java.io.*;
import java.util.*;

public class Coin_Game {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n1,n2;
            n1=sc.nextLong();
            n2=sc.nextLong();
            if(Math.max(n1,n2)>2*Math.min(n1,n2))
            {
                System.out.println("NO");
            }
            else if(((long)2*n1-n2)%3==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}