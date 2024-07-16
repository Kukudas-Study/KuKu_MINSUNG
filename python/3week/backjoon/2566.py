
# 최댓값
matrix = [list(map(int, input().split())) for _ in range(9)]

maxNum = 0
maxRow, maxCol = 0, 0
for row in range(9):
    for col in range(9):
        if maxNum <= matrix[row][col]:      # 각 행렬의 값들 비교, 비교할 때마다 row, col 1씩 증가시킴
            maxRow = row + 1
            maxCol = col + 1
            maxNum = matrix[row][col]

print(maxNum)
print(maxRow, maxCol)