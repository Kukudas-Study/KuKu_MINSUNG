# 1층의 3호, 2층의 3호
# 0층부터 있고 각 층에는 1호부터 있음
# 0층의 i호 에는 i명이 산다

# a층의 b호에 살려면 자신의 아래(a - 1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 함
# 1층의 3호에 살려면 자신의 아래(1 - 1)층의 1호부터 3호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 함
# 2층의 3호에 살려면 자신의 아래(2 - 1)층의 1호부터 3호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 함

# 역 "ㄴ"자 패턴
# 4 => 1 6 21 56
# 3 => 1 5 15 35
# 2 => 1 4 10 20
# 1 => 1 3 6 10
# 0 => 1 2 3 4

T = int(input())

for _ in range(T):
    K = int(input())   # 1층
    N = int(input())   # 3호

    dp = []

    # 0층 i호 명수 설정
    for i in range(N):
        dp.append(i + 1)

    # 1층부터 진행
    for i in range(1, K + 1):
        for j in range(N):
            if j > 0:
                dp[j] += dp[j - 1]      # 더해준 수 만큼 추가해줌
            else:
                continue

    print(dp[N - 1])








