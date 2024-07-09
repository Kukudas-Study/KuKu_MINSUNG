
def hanoi (from_pos, to_pos, aux_pos, n, answer):
    if n == 1:          # 옮겨야 하는 원판이 한 개인 경우 기둥으로 바로 옮긴다
        answer.append([from_pos, to_pos])

    else:               # 옮겨야 하는 원판이 두 개 이상이라면 재귀의 과정을 거친다
        # 가장 아래 원판 제외한 나머지 n - 1개의 원판을 남는 기둥으로 옮긴다
        hanoi(from_pos, aux_pos, to_pos, n - 1, answer)

        # 가장 아래의 원판을 목표 지점으로 옮긴다
        hanoi(from_pos, to_pos, aux_pos, 1, answer)

        # 중간, 보조 기둥으로 옮겨진 n - 1개의 원판들을 목표했던 기둥으로 옮긴다
        hanoi(aux_pos, to_pos, from_pos, n - 1, answer)
    return answer

def solution(n):
    # from_pos: 출발 기둥 | to_pos: 목표 기둥 | aux_pos: 중간, 보조 기둥 | n: 옮겨야 할 원판 개수
    answer = hanoi(1, 3, 2, n, [])

    return answer

print(solution(2))