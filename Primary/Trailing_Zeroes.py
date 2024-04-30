t=int(input())
while t>0:
    n=int(input())
    count=0
    i=5
    while n//i>=1:
        count=count+(n//i)
        i=i*5
    print(count)
    t=t-1