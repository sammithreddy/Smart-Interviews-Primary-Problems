#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t-->0)
    {
        string s;
        cin>>s;
        char ans='.';
        bool flag=false;
        for(int i=0;i<s.length();++i)
        {
            for(int j=i+1;j<s.length();++j)
            {
                if(s[i]==s[j])
                {
                    ans=s[i];
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                break;
            }
        }
        cout<<ans<<endl;
    }
    return 0;
}