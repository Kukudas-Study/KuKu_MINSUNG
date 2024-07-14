
# 바구니 뒤집기
N, M = map(int, input().split())
ball_list = [i for i in range(1, N + 1)]        # 컴프리핸션
temp = 0

for _ in range(M):
    s, e = map(int, input().split())
    # 리스트 슬라이싱 활용하여 역순으로 변경
    # ball_list[0] = ball_list[3], ball_list[1] = ball_list[2]
    ball_list[s - 1:e] = ball_list[s - 1:e][::-1]

print(*ball_list)       # 리스트 요소 한 번에 출력