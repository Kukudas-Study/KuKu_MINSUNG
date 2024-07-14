
# 평균

N = int(input())
subjects = list(map(int, input().split()))
M = max(subjects)                               # 최댓값 대입
sum_subjects = sum(subjects)                    # 모든 과목의 합 대입
print(sum_subjects / M * 100 / N)               # 조건식에 대입해서 출력
