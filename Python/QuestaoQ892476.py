def lista(n):
    if n == []:
        return
    lista(n[1])
    lista(n[2])
    print(n[0], end=' ')  # 5,9,7,4,6,8,3


n6 = [4, [], []]
n5 = [6, [], n6]
n2 = [8, n5, []]
n3 = [5, [], []]
n4 = [9, [], []]
n1 = [7, n3, n4]
n0 = [3, n1, n2]
lista(n0)
