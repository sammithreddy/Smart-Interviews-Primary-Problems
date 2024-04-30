import java.io.*;
import java.util.*;

public class X_and_Y_SetBits {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int x,y;
            x=in.nextInt();
            y=in.nextInt();
            System.out.println(((1<<x)%1000000007)|((1<<y)%1000000007));
        }
    }
}