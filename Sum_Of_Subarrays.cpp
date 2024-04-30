#include <bits/stdc++.h>
using namespace std;
int main() {
    int n;
    cin>>n;
    long long int arr[n];
    for(int i=0;i<n;++i)
    {
        cin>>arr[i];
    }
    long long int rightsum[n];
    int j=0;
    for(int i=n-1;i>=0;--i)
    {
        if(i==n-1)
        {
            rightsum[i]=0;
        }
        else
        {
            rightsum[i]=rightsum[i+1]+arr[i+1];
        }
    }
    long long int totalsum=rightsum[0]+arr[0];
    long long int leftsum[n];
    for(int i=0;i<n;++i)
    {
        if(i==0)
        {
            leftsum[i]=0;
        }
        else
        {
            leftsum[i]=leftsum[i-1]+arr[i-1];
        }
    }
    int q;
    cin>>q;
    for(int i=0;i<q;++i)
    {
        int s,e;
        cin>>s>>e;
        cout<<totalsum-leftsum[s]-rightsum[e]<<endl;
    }
    return 0;
}