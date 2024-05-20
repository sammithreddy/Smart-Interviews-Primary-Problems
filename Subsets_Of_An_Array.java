import java.io.*;
import java.util.*;

public class Subsets_Of_An_Array {
    public static void print(ArrayList<Integer> ans)
    {
        if(ans.size()==0)
        {
            return;
        }
        for(int i=0;i<ans.size();++i)
        {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
    public static ArrayList<ArrayList<Integer>> subSets(int[] arr)
    {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        for(int nums:arr)
        {
            int n=outer.size();
            for(int i=0;i<n;++i)
            {
                ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(nums);
                outer.add(inner);
            }
        }
        Collections.sort(outer,new Comparator<ArrayList<Integer>>()
        {
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2)
            {
                int size=Math.min(list1.size(),list2.size());
                for(int i=0;i<size;++i)
                {
                    int cmp=Integer.compare(list1.get(i),list2.get(i));
                    if(cmp!=0)
                    {
                        return cmp;
                    }
                }
                return Integer.compare(list1.size(),list2.size());
            }
        });
        return outer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.parallelSort(arr);
            ArrayList<ArrayList<Integer>> ans=subSets(arr);
            for(int i=0;i<ans.size();++i)
            {
                print(ans.get(i));
            }
            System.out.println();
        }
    }
}