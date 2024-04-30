import java.io.*;
import java.util.*;

public class Count_Set_Bits {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            long n=in.nextLong();
            int count=0;
            while(n>0)
            {
                if((n&1)==1)
                {
                    count++;
                }
                n=n>>1;
            }
            System.out.println(count);
        }
    }
}