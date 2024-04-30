t=int(input())
while t>0:
    x,y=map(int,input().split(" "))
    print((((1<<(x+y))-(1<<y))%1000000007))
    t=t-1