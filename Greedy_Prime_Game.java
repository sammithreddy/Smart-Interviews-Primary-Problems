import java.io.*;
import java.util.*;

public class Greedy_Prime_Game {

    public static void main(String[] args) {
        int size=(int)1e5+1;
        boolean primes[]=new boolean[size];
        primes[0]=true;
        primes[1]=true;
        List<Integer> prime=new ArrayList<>();
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
        for(int i=2;i<size;++i)
        {
            if(!primes[i])
            {
                prime.add(i);
            }
        }
        boolean game[]=new boolean[size];
        game[0]=true;
        game[1]=true;
        for(int i=2;i<size;++i)
        {
            if(primes[i])
            {
                int index=Collections.binarySearch(prime,i);
                index=-(index+2);
                if(!game[i-prime.get(index)])
                {
                    game[i]=true;
                }
            }
        }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            if(!game[n])
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