def solution(n):
    answer = ''
    str1 = "수"
    str2 = "박"

    # 홀수, 짝수로 구분하여 출력
    for i in range(n):
        if i % 2 == 0:
            answer += str1
        else:
            answer += str2

    return answer