import java.io.*;
import java.util.*;

public class Optimal_Prime_Game {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       int size=10001;
       boolean primes[]=new boolean[size];
       primes[0]=true;
       primes[1]=true;
       for(int i=2;i*i<size;++i)
       {
           if(!primes[i])
           {
               for(int j=i*2;j<size;j=j+i)
               {
                   primes[j]=true;
               }
           }
       }
       boolean game[]=new boolean[size];
       for(int i=0;i<size;++i)
       {
           if(!primes[i])
           {
               game[i]=true;
           }
           else
           {
               for(int j=0;j<i;++j)
               {
                   if(!primes[j])
                   {
                       int pair=i-j;
                       if(game[pair]==false)
                       {
                           game[i]=true;
                           break;
                       }
                   }
               }
           }
       }
       while(t-->0)
       {
           int n=sc.nextInt();
           if(game[n])
           {
               System.out.println("First");
           }
           else
           {
               System.out.println("Second");
           }
       }
    }
}