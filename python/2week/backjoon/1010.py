
import math

T = int(input())

for _ in range(T):
    west, east = map(int, input().split(' '))

    # 경우의 수 조회하는 메소드 사용
    print(math.comb(east, west))




