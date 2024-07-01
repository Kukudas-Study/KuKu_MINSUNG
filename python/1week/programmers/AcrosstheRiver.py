## 트럭 2대가 올라갈 수 있고 => bridge_length = 2
## 무게가 [7, 4, 5, 6] => truck_weights = [7, 4, 5, 6]
## 다리는 weight 이하까지 무게 견딤 => weight = 10kg

from collections import deque

def solution(bridge_length, weight, truck_weights):
    answer = 0
    bg_weight = 0
    bg = deque([0] * bridge_length)

    truck_weights = deque(truck_weights)

    while len(truck_weights) > 0:
        # 두 가지 조건
        # 건너지 않는다 (아직 다 건너지 않았다)
        temp = bg.popleft()
        bg_weight -= temp

        if truck_weights[0] + bg_weight > weight:
            bg.append(0)
        else:
            # 건넌다
            bg_weight += truck_weights[0]
            bg.append(truck_weights.popleft())

        print(bg)
        answer += 1

    answer += bridge_length
    print(answer)

# print(solution(2, 10, [7, 4, 5, 6]))

