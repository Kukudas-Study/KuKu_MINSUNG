
# 4번 학생은 "3번" 학생이나 "5번" 학생에게만 체육복을 빌려줄 수 있음
def solution(n, lost, reserve):
    answer = 0

    # set을 사용하여 공통 요소 제거
    reserve_del = set(reserve) - set(lost)
    lost_del = set(lost) - set(reserve)

    # 여벌 리스트 순회, 도난 리스트 요소의 전후값 판별하여 만약에 여벌 리스트 (요소값 - 1) or (요소값 + 1) 이
    # 도난 리스트에 존재하면 해당 요소값을 제거
    for i in reserve_del:
        if i - 1 in lost_del:
            lost_del.remove(i - 1)

        elif i + 1 in lost_del:
            lost_del.remove(i + 1)

    # n - 도난 리스트 길이
    answer = n - len(lost_del)

    return answer

print(solution(5, [2, 4], [1, 3, 5]))