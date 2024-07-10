
# numbers = []
# for i in range(1, 11):
#     numbers.append(i)
#
# print(numbers)

# 한 줄에 출력 가능
numbers = [i for i in range(1, 11)]
print(numbers)

# 조건문 추가된 list comprehension
numbers = [i for i in range(1, 11) if i % 2 == 1]

# 범위 내에서 홀수만 출력
print(numbers)