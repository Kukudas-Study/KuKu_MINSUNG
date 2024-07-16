
# 팰린드롬인지 확인하기

inputString = input()
char_list = list(inputString)
char_rev_list = list(reversed(inputString))
print(1) if char_list == char_rev_list else print(0)

