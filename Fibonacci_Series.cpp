#include <bits/stdc++.h>
using namespace std;

int main() {
    int size=10000001;
    int arr[size];
    arr[0]=1,arr[1]=1;
    for(int i=2;i<size;++i)
    {
        arr[i]=(arr[i-1]%(int)(1e9+7)+arr[i-2]%(int)(1e9+7))%(int)(1e9+7);
    } 
    int t;
    cin>>t;
    while(t-->0)
    {
        int n;
        cin>>n;
        cout<<arr[n]<<endl;
    }
    return 0;
}