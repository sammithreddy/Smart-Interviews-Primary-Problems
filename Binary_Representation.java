import java.io.*;
import java.util.*;

public class Binary_Representation {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t=cin.nextInt();
        while(t-->0)
        {
            int a=cin.nextInt();
            System.out.println(Integer.toBinaryString(a));
        }
    }
}