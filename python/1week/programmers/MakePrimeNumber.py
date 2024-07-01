# 소수 만들기!
# 3개의 수를 더했을 때, 소수가 되는 경우의 개수
# 서로 다른 3개의 숫자들을 골라 더했을 때 소수가 되는 경우의 개수를 return

def checkPrimeNumber(num1, num2, num3):
    sum = num1 + num2 + num3

    # 소수 판별
    for i in range(2, sum):
        # 합의 나머지가 0인 경우 False 아니면 1 출력
        # 소수일 때는 True 반환 아니면 False 반환
        if sum % i == 0:
            return False
    return True

def solution(nums):
    answer = 0
    # 3개의 수만 더하기
    for i in range(0, len(nums) - 2):               # nums 배열 기준 0 ~ 1
        # i의 다음 수부터 i를 뺀 개수
        for j in range(i + 1, len(nums) - 1):       # nums 배열 기준 1 ~ 2
            # j의 다음 수부터 i, j를 뺀 개수
            for k in range(j + 1, len(nums)):       # nums 배열 기준 2 ~ 3
                # 소수 판별 함수에서 소수로 확인되면 카운팅
                if checkPrimeNumber(nums[i], nums[j], nums[k]):
                    answer += 1

    return answer

print(solution([1, 2, 3, 4]))

