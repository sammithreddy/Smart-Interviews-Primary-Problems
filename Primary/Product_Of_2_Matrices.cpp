#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t-->0)
    {
        int n1,m1,n2,m2;
        cin>>n1>>m1;
        int a[n1][m1];
        for(int i=0;i<n1;++i)
        {
            for(int j=0;j<m1;++j)
            {
                cin>>a[i][j];
            }
        }
        cin>>n2>>m2;
        int b[n2][m2];
        for(int i=0;i<n2;++i)
        {
            for(int j=0;j<m2;++j)
            {
                cin>>b[i][j];
            }
        }
        int c[n1][m2];
        for(int i=0;i<n1;++i)
        {
            for(int j=0;j<m2;++j)
            {
                c[i][j]=0;
                for(int k=0;k<m1;++k)
                {
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
                cout<<c[i][j]<<" ";
            }
            cout<<endl;
        }
        
    }
    return 0;
}