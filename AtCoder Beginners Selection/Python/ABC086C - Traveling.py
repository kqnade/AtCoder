moveturn = input()
plan = []

for i in range(int(moveturn)):
    plan.append(input().split())

x = 0
y = 0
t = 0

for i in range(int(moveturn)):
    if abs(x - int(plan[i][1])) + abs(y - int(plan[i][2])) <= int(plan[i][0]) - t and (int(plan[i][0]) - t - abs(x - int(plan[i][1])) - abs(y - int(plan[i][2]))) % 2 == 0:
        x = int(plan[i][1])
        y = int(plan[i][2])
        t = int(plan[i][0])
    else:
        print("No")
        exit()

print("Yes")