res=[]
def toh(n,a,b,c):
    if(n==1):
        res.append("Move 1 from {} to {}".format(a,b))
        return
    toh(n-1,a,c,b)
    res.append("Move {} from {} to {}".format(n,a,b))
    toh(n-1,c,b,a)
for _ in range(int(input())):
    n=int(input())
    res=[]
    toh(n,"A","C","B")
    print(len(res))
    for i in res:
        print(i)