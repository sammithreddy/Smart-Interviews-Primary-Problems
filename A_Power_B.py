def apowerb(a,b):
    if b==0:
        return 1;
    store=apowerb(a,b//2)
    if(b%2==0):
        return ((store%1000000007)*(store%1000000007))%1000000007
    else:
        return (a*((store%1000000007)*(store%1000000007)))%1000000007
t=int(input())
while t>0:
    l=list(map(int,input().split(" ")))
    print(apowerb(l[0],l[1]))
    t=t-1