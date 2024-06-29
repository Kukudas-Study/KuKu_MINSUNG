# example - ord('a') => 정수 97 반환
s = ord(input())
t = ord('a')

while t <= s:
    print(chr(t), end=' ')
    t += 1
