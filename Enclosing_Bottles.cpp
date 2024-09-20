#include <bits/stdc++.h>
using namespace std;
void solution(int arr[],int n)
{
    map<int,int> m;
    int ans=0;
    for(int i=0;i<n;++i)
    {
        m[arr[i]]++;
        ans=max(ans,m[arr[i]]);
    }
    cout<<ans<<endl;
}
int main() {
    int t,n;
    cin>>t;
    while(t-->0)
    {
        cin>>n;
        int arr[n];
        for(int i=0;i<n;++i)
        {
            cin>>arr[i];
        }
        solution(arr,n);
    }
    return 0;
}