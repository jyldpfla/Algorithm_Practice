# # 6025
# a, b = input().split()
# c = int(a) + int(b)
# print(c)

# # 6026
# a = input()
# b = input()
# print(float(a) + float(b))

# # 6027 - 10진수 -> 16진수
# a = input()
# n = int(a)  #입력된 a를 10진수 값으로 변환해 변수 n에 저장
# print('%x'% n)  #n에 저장되어있는 값을 16진수(hexadecimal) 소문자 형태 문자열로 출력

# # 6028 - 10진수 -> 16진수 대문자
# a = input()
# print('%X' % int(a))

# 6029 - 10진수 -> 8진수
# a = input()
# n = int(a, 16)  #입력된 a를 16진수로 인식해 변수 n에 저장
# print('%o' % n) #n에 저장되어있는 값을 8진수(octal) 형태 문자열로 출력

# 6030 - 유니코드 -> 10진수
# a = ord(input())
# print(a)

# # 6031 - 10진수(32 ~ 126) -> 유니코드
# a = chr(int(input()))
# print(a)

# # 6042 실수 1개 입력받아 소숫점이하 자리 변환하기
# a = float(input())
# print(round(a, 2))
# # print(format(a, ".2f"))