package p25314;

import java.util.Scanner;

/**
 * 반복문 - 코딩은 체육과목 입니다
 * long int - 4byte 정수까지 저장 가능한 정수 자료형
 * log long int - 8byte 정수까지 저장 가능한 정수 자료형
 * 첫 번째 줄에는 문제의 정수 N (4 <= N <= 1000; N은 4의 배수)
 * 혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt() / 4;
		
		System.out.println("long ".repeat(N) + "int");
	}
}
