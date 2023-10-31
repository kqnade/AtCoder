layer = input()
mochi = []

for i in range(int(layer)):
    mochi.append(input())

mochi.sort(reverse=True)

mochi = list(dict.fromkeys(mochi))

print(len(mochi))