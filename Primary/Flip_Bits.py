t=int(input())
while t>0:
    a,b=map(int,input().split())
    a=a^b
    count=0
    while a!=0:
        if a&1==1:
            count=count+1
        a=a>>1
    print(count)
    t=t-1