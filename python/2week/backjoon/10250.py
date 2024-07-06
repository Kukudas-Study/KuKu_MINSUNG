# T개의 테스트 데이터 입력
T = int(input())

# ACM 호텔
# 층 수:
# 6 12 10 (H, W, N)
# 30 50 72
# N % H = 10 % 6 = 4

# room_num = (N // H) + 1 = 2

# T번 반복 - 언더스코어 문법 적용
for _ in range(T):
    H, W, N = map(int, input().split(' '))

    # 층 수 (10 % 6 = 4, 4층)
    # 72 % 30 = 12, 12층
    floor = N % H

    # 호 수 (10 // 6 = 1 + 1 = 2)
    # 72 // 30 = 2 + 1 = 3
    room_num = N // H + 1

    # 예외 처리 - 0층이 되면 안 됨 (ex. 4, 8, 4 or 6, 12, 6)
    if floor == 0:
        floor = H
        room_num -= 1

    # 결과: 층수 * 100 + 호수
    print(floor * 100 + room_num)


