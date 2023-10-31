otoshidama = list(map(int, input().split()))
amount = otoshidama[0]
cash = otoshidama[1]

demoninations = [1000, 5000, 10000]

for i in range(amount + 1):
    for j in range(amount + 1 - i):
        if (amount - i - j) * 1000 + i * 5000 + j * 10000 == cash:
            print(j, i, amount - i - j)
            exit()

print(-1, -1, -1)

