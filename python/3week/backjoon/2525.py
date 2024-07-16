
# 오븐 시계
# 오븐구이가 끝나는 시간을 분 단위로 자동 계산
A, B = map(int, input().split())
C = int(input())

if B + C >= 60:
    A += (B + C) // 60
    A = A % 24                              # 시간을 24로 나누어줌
    # 반올림 계산 ((B + C)값이 60분이 넘어가는 경우 1배, 2배 해준 값을 빼줌)
    B = (B + C) - (60 * ((B + C) // 60))
else:
    B += C

print(A, B)