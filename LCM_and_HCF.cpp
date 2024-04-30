#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t-->0)
    {
        long long int a,b;
        cin>>a>>b;
        long long int max,min;
        if(a>b)
        {
            max=a;
            min=b;
        }
        else
        {
            max=b;
            min=a;
        }
        while(max%min!=0)
        {
            long long int temp=min;
            min=max%min;
            max=temp;
        }
        cout<<(a*b)/min<<" "<<min<<endl;;
    }   
    return 0;
}