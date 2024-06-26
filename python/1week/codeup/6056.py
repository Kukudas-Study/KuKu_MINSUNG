
a, b = map(int, input().split())
print("True" if (a and not b) or (not a and b) else "False")