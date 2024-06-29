
num1, num2 = input().split()
num1 = int(num1)
num2 = int(num2)

# 2중 for 문
for i in range(1, num1 + 1):
    for j in range(1, num2 + 1):
        print(i, j)

