import java.io.*;
import java.util.*;
import java.math.*;
public class Power_Of_two {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t=cin.nextInt();
        while(t-->0)
        {
            long n=cin.nextLong();
            int count=0;
            while(n>0)
            {
                if((n&1)==1)
                {
                    count++;
                }
                n=n>>1;
            }
            if(count==1)
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