import java.io.*;
import java.util.*;

public class Prime_Coins {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            if(n%6==0)
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