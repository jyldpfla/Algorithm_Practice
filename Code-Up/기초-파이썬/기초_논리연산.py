# 6052 - 정수 입력받아 참 거짓 평가하기
# n = int(input())
# print(bool(n))

# # 6053 : [기초-논리연산] 참 거짓 바꾸기
# a = bool(int(input())) 
# print(not a) # int type 넘겨도 자동으로 bool로 return

# # 6054 : [기초-논리연산] 둘 다 참일 경우만 참 출력하기
# a, b = input().split()
# print(bool(int(a)) and bool(int(b)))

# # 6055 : [기초-논리연산] 하나라도 참이면 참 출력하기
# a, b = input().split()
# print(bool(int(a)) | bool(int(b)))

# # 6056 : [기초-논리연산] 참/거짓이 서로 다를 때에만 참 출력하기
# a, b = map(bool, map(int, input().split()))
# print((a and not b) | (not a and b))

# # 6057 : [기초-논리연산] 참/거짓이 서로 같을 때에만 참 출력하기
# a, b = map(bool, map(int, input().split()))
# print(a == b)

# # 6058 : [기초-논리연산] 둘 다 거짓일 경우만 참 출력하기
# a, b = map(bool, map(int, input().split()))
# print(not a and not b)