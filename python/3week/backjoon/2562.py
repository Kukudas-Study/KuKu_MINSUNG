

# 최댓값 - 3, 12, 29, 38, 40, 57, 61, 74, 85
numlist = [0] * 9
maxNum = 0
idx = 0

for i in range(0, 9):
    numlist[i] = int(input())

    if maxNum < numlist[i]:         # 최댓값 구하기
        maxNum = max(numlist)
        idx = i                     # 최댓값 인덱스 대입

print(maxNum)
print(idx + 1)
