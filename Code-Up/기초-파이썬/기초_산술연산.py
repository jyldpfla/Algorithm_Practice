# 기초 - 산술연산

# # # 6032 - 정수 부호 변환
# i = int(input())
# print(-i)

# # 6033 - 문자 1개 입력받고 다음 문자 출력
# a = input()
# print(chr(ord(a) + 1))

# # 6034 - 정수 2개의 차 계산
# a, b = input().split()
# print(int(a) - int(b))

# # 6035 - 실수 2개의 곱
# f1, f2 = input().split()
# print(float(f1) * float(f2))

# # 6036 - 단어 여러 번 출력
# w, n = input().split()
# print(w*int(n))

# # 6037 - 문장 여러 번 출력
# n = input()
# s = input()
# print(int(n)*s)

# # 6038 - 정수 2개 거듭제곱 계산
# a, b = input().split()
# print(int(a)**int(b))

# # 6039 - 실수 2개 거듭제곱
# f1, f2 = input().split()
# print(float(f1)**float(f2))

# # 6040 - 정수 2개 나눈 몫
# a, b = input().split()
# print(int(a)//int(b))

# # 6041 - 정수 2개 나눈 나머지
# a, b = input().split()
# print(int(a) % int(b))

# # 6043 - 실수 2개 입력받아 나눈 결과 계산
# # f1, f2 = input().split()
# # f1 = float(f1)
# # f2 = float(f2)
# f1, f2 = map(float, input().split())
# print(format(f1 /f2, ".3f"))

# 6044 - 정수 2개 입력받아 자동 계산하기
# a, b = map(int, input().split())
# print(a+b)
# print(a-b)
# print(a*b)
# print(a//b)
# print(a%b)
# print(format(a / b, ".2f"))

# # 6045 - 정수 3개 입력받아 합과 평균 출력하기
# a, b, c = map(int, input().split())
# sum = a + b + c
# avg = float(sum / 3)
# print(a + b + c, f'{avg:.2f}')
# # print(a + b + c, '%.2f' % avg)