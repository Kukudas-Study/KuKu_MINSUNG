
T = int(input())

# ACM 호텔
# 층 수:
# 6 12 10 (H, W, N) - 호텔의 층 수, 각 층의 방 수, 몇 번째 손님
# 30 50 72
# N % H = 10 % 6 = 4

for _ in range(T):
    H, W, N = map(int, input().split())

    floor = N % H               # 4층
    room_num = (N // H) + 1     # 방 번호

    if floor == 0:
        floor == H
        room_num -= 1

    print(floor * 100 + room_num)





