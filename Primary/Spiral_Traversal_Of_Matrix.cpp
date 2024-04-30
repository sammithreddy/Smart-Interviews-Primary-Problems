#include <bits/stdc++.h>
using namespace std;
void printspiral(int **arr,int n,int x,int y)
{
    if(x>=n || y>=n)
    {
        return;
    }
    for(int i=x;i<n;i++)
    {
        cout<<arr[x][i]<<" ";
    }
    for(int i=x+1;i<n;++i)
    {
        cout<<arr[i][n-1]<<" ";
    }
    if((n-1)!=x)
    {
        for(int i=n-2;i>=y;i--)
        {
            cout<<arr[n-1][i]<<" ";
        }
    }
    if((n-1)!=y)
    {
        for(int i=n-2;i>x;i--)
        {
            cout<<arr[i][y]<<" ";
        }
    }
    printspiral(arr,n-1,x+1,y+1);
}
int main() {
    int t;
    cin>>t;
    while(t-->0)
    {
        int n;
        cin>>n;
        int **arr=new int*[n];
        for(int i=0;i<n;++i)
        {
            arr[i]=new int[n];
        }
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                cin>>arr[i][j];
            }
        }
        printspiral(arr,n,0,0);
        cout<<endl;
    }   
    return 0;
}