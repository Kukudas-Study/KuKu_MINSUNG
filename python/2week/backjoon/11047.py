

# 두 수 입력
N, K = map(int, input().split())

# coin 리스트 생성
coin_list = [int(input()) for _ in range(N)]

# coin 리스트 역순 정렬
coin_list.sort(reverse = True)
count = 0

# coin 리스트 요소(j)와 비교하여 K(합)가 j보다 크거나 같으면 갯수는 몫, 나머지는 거스름돈으로
for j in coin_list:
    if K >= j:
        count += (K // j)
        K %= j

print(count)