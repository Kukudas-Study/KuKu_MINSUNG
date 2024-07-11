
# 윤년 : 4의 배수, 100배수가 아닐 때 또는 400의 배수일 때
# year % 4 == 0 && year % 100 != 0 || year % 400 == 0

year = int(input())
if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
    print(1)
else:
    print(0)

