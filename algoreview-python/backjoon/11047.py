N, K = map(int, input().split())                # 두 수 입력

coin_list = [int(input()) for _ in range(N)]    # 컴프리핸션

coin_list.sort(reverse = True)                  # 역순 정렬
count = 0

for j in coin_list:
    if K >= j:                                  # 주어진 K와 배열 요소 비교
        count += (K // j)                       # 거스릅돈 갯수 로직 우선 진행
        K %= j                                  # 나머지를 거스름돈으로

print(count)                                    # 최종 출력

