t=int(input())
while t>0:
    n=int(input())
    ans=((n+1)*(n+2))/2
    l=list(map(int,input().split()))
    s=sum(l)
    print(int(ans-s))
    t=t-1