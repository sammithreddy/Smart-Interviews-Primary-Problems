import java.util.*;
public class Divisible_Subsequence
{
    public static boolean check(List<Integer> arr,int div)
    {
        if(arr.size()==0)
        {
            return false;
        }
        int Sum=0;
        for(int i=0;i<arr.size();++i)
        {
            Sum=Sum+arr.get(i);
        }
        return Sum%div==0;
    }
    public static boolean subSets(int arr[],int div)
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int nums:arr)
        {
            int n=outer.size();
            for(int i=0;i<n;++i)
            {
                ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(nums);
                if(check(inner,div))
                {
                    return true;
                }
                outer.add(inner);
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int div=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextInt();
            }
            if(subSets(arr,div))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}