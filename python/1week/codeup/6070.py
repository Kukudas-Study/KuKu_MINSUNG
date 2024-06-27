
# 12개의 달 : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12

month = int(input())

if month // 3 == 1:
    print("spring")
elif month // 3 == 2:
    print("summer")
elif month // 3 == 3:
    print("fall")
else:
    print("winter")