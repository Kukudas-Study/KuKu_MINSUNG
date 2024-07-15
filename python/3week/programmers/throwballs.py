
# 공 던지기
def solution(numbers, k):
    answer = 0
    if len(numbers) < k * 2:        # 길이를 넘어가는 경우 기존 리스트 길이에 2배를 곱해줘서 몇 번째인지 확인해야 함
        numbers = numbers * ((k * 2) // len(numbers) + 1)

    answer = numbers[2 * (k - 1)]   # 넘어가지 않는 경우
    return answer

print(solution([1, 2, 3, 4], 2))