#include <bits/stdc++.h>
using namespace std;
bool isPrime(long int n)
{
    for(int i=2;i*i<=n;++i)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
}
int main() {
    int t;
    cin>>t;
    while(t-->0)
    {
        long long int n;
        cin>>n;
        if(isPrime(n))
        {
            cout<<"Yes"<<endl;
            continue;
        }
        cout<<"No"<<endl;
    }
    return 0;
}