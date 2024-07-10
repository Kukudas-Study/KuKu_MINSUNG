
money = int(input())
change = 1000 - money
count = 0

change_list = [500, 100, 50, 10, 5, 1]

for i in range(0, len(change_list)):
    # 거스름돈이 0인 경우 빠져 나옴
    if change == 0:
        break

    if change >= change_list[i]:
        count += change // change_list[i]
        change %= change_list[i]

print(count)