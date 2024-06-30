
# 피로도!
# 하루에 1시간 일하면 => 피로도 A, 일은 B만큼 처리
# 1시간 쉬면 => 피로도 C만큼 줄어듦 (단, 피로도가 음수로 내려가면 0으로 바뀜)
# 조건: 피로도가 최대한 M을 넘지 않게 일을 하려고 함 (하루 24시간에 얼마나 일을 할 수 있는가)

# 5, 3, 2, 10 => 1시간 (5, 3),  1시간 쉬면 (5 - 3 = 2), 최대 피로도 : 10
a, b, c, m = map(int, input().split())

# 피로도 변수 생성
pirodo = 0

# 일 변수 생성
job = 0

# 24번 반복 => 24시간 개념 적용
for i in range(1, 25):
    # 피로도 + 축적 피로도 <= 최대 피로도
    if pirodo + a <= m:
        pirodo += a
        job += b
    elif pirodo + a > m:
        pirodo -= c
        if pirodo < 0:
            pirodo = 0

print(job)





