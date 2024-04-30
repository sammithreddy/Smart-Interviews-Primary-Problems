t=int(input())
for i in range(t):
    n=int(input())
    s=""
    print(f"Case #{i+1}:")
    for i in range(n):
        s=(" "*(n-i-1))+"*"*(i+1)
        print(s)