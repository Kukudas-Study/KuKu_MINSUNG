
def solution(people, limit):
    answer = 0

    # 순차 정렬
    people.sort()

    count = 0
    for i in range(0, len(people)):
        if people[i] + people[i + 1] <= limit:
            people.remove(i + 1)
            count += 1

    answer = count + len(people)

    return answer

print(solution([70, 50, 80, 50], 100))