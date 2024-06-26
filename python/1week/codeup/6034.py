
num1, num2 = input().split(" ")

# int 형을 선언하여 자료형 타입 에러 해결
# TypeError: unsupported operand type(s) for -: 'str' and 'str'
result = int(num1) - int(num2)

print(result)