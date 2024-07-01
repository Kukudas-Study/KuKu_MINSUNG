
# 에라토스테네스의 체, N보다 작거나 같은 모든 소수를 찾는 알고리즘

# 두 수 입력 받음 (7, 3번째), 2부터 7까지
# 2, 3, 4, 5, 6, 7 => 2 > 4 > 6 > 3 > 5 > 7
n, k = map(int, input().split())

def solution(n, k):
    # 카운트, 소수 리스트 초기화
    count = 0

    # 길이가 (n + 1)인 불리언 배열 생성
    array = [True] * (n + 1)

    # 2부터 n까지
    for i in range(2, n + 1):
        if array[i]:
            # 자신을 포함한 배수 False 처리
            for j in range(i, n + 1, i):
                if array[j] == True:
                    array[j] = False
                    count += 1
                    # 처리할 때마다 count해서 목표에 다다를 경우 반환
                    if count == k:
                        return j

print(solution(n, k))