for _ in range(int(input())):
    a,b=map(str,input().split())
    c=a+"%"+b
    print(eval(c))