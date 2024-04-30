from sys import stdin,stdout
dp=[0]*(1000000+1)
def fact(n):
    if(n>=0):
        dp[0]=1
        for i in range(1,n+1):
            dp[i]=(i*dp[i-1])%1000000007;
fact(1000000)
for _ in range(int(input())):
    n=int(stdin.readline())
    stdout.write(str(dp[n])+'\n')