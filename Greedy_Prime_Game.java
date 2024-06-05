import java.io.*;
import java.util.*;

public class Greedy_Prime_Game {
    public static int binarySearch(int arr[],int target)
    {
        int s=0,e=arr.length-1;
        int mid=(s+e)/2;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return e;
    }
    public static int[] sieve(int n)
    {
        boolean primes[]=new boolean[n+1];
        for(int i=2;i*i<=n;++i)
        {
            if(!primes[i])
            {
                for(int p=i*2;p<=n;p=p+i)
                {
                    primes[p]=true;
                }
            }
        }
        int count=0;
        for(int i=2;i<=n;++i)
        {
            if(!primes[i])
            {
                count++;
            }
        }
        int prime[]=new int[count+1];
        int size=0;
        for(int i=2;i<=n;++i)
        {
            if(!primes[i])
            {
                prime[size]=i;
                size++;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prime[]=sieve(100000);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String ans="First";
            if(n<2)
            {
                System.out.println("Second");
                continue;
            }
            while(n>=2)
            {
                int e=binarySearch(prime,n);
                n=n-prime[e];
                if(n<2)
                {
                    ans="First";
                    break;
                }
                e=binarySearch(prime,n);
                n=n-prime[e];
                if(n<2)
                {
                    ans="Second";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}