nab = input()
n = int(nab.split()[0])
a = int(nab.split()[1])
b = int(nab.split()[2])

count = 0

for i in range(1, n + 1):
    if a <= sum(list(map(int, list(str(i))))) <= b:
        count += i

print(count)