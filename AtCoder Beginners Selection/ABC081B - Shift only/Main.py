n = input()
numlist = list(map(int, input().split()))

count = 0
while all(num % 2 == 0 for num in numlist):
    numlist = [num / 2 for num in numlist]
    count += 1

print(count)