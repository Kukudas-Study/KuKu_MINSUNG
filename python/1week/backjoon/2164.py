## 카드 2
## N장의 카드 => 1 ~ N까지의 번호가 붙어 있음
## 6을 입력 => 1 2 3 4 5 6
## 처음에는 제일 위에 있는 카드를 바닥에 버린다.
## 그 다음 제일 위에 있는 카드를 가장 아래로 옮긴다.

# deque 활용
from collections import deque

# 정수 입력
num = int(input())

# 리스트 컴프리핸션 적용
dq = deque([i for i in range(1, num + 1)])

# deque의 길이가 1이 될 때까지 시행
while(len(dq) > 1):
    dq.popleft()        # 제일 위 카드 바닥에 버림
    dq.rotate(-1)       # 제일 위 카드 가장 아래로 옮김 (음수면 왼쪽, 양수면 오른쪽)

print(dq[0])


