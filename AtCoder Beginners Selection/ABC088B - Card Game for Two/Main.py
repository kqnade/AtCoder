n = input()
numlist = list(map(int, input().split()))

alice = 0
bob = 0

numlist.sort(reverse=True)

for i in range(len(numlist)):
    if i % 2 == 0:
        alice += numlist[i]
    else:
        bob += numlist[i]

print(alice - bob)
