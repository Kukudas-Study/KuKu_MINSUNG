
# 리스트 자르기
def solution(n, slicer, num_list):
    answer = []
    a = int(slicer[len(slicer) - 3])
    b = int(slicer[len(slicer) - 2])
    c = int(slicer[len(slicer) - 1])

    if n == 1:                          # 0번 인덱스 ~ b번 인덱스
        answer = num_list[0:b+1]
    elif n == 2:                        # a번 인덱스 ~ 마지막 인덱스
        answer = num_list[a:num_list[len(num_list) - 1]+1]
    elif n == 3:
        answer = num_list[a:b+1]        # a번 인덱스 ~ b번 인덱스
    elif n == 4:
        answer = num_list[a:b+1:c]      # c 간격으로

    return answer

print(solution(3, [1, 5, 2], [1, 2, 3, 4, 5, 6, 7, 8, 9]))
