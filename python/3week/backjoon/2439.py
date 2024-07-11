
# 별 찍기 - 2

N = int(input())
for i in range(N):
    print(' ' * (N - 1 - i) + "*" * (i + 1))

