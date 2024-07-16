
# 주사위 세개
# 리스트 생성
numlist = list(map(int, input().split()))

# 각 리스트 요소들 비교하여 조건에 맞는 결과 출력
if numlist[0] == numlist[1] == numlist[2]:
    print(10000 + numlist[0] * 1000)
elif numlist[0] == numlist[1] or numlist[0] == numlist[2]:
    print(1000 + numlist[0] * 100)
elif numlist[1] == numlist[2]:
    print(1000 + numlist[1] * 100)
else:
    print(max(numlist) * 100)
