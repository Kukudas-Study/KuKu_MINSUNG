

# 규칙: (i, j) = (i - 1, j - 1) + (i, j - 1)
def dp(N, M):
    # 초기화 - 이해 X;;;
    dp = [[1] * (M + 1) for _ in range(M + 1)]

    # 이 부분 역시 이해 X;;;
    for i in range(2, M + 1):
        dp[1][i] = i
    for i in range(2, N + 1):
        for j in range(i + 1, M + 1):
            dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1]

    return dp[N][M]

for _ in range(int(input())):
    # 정수 입력 받음
    N, M = map(int, input().split())
    print(dp(N, M))



