package p1001;

import java.util.Scanner;

/**
 * 입출력과 사칙 연산
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 */
/*
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10), 첫째 줄에 A-B를 출력
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A - B);
	}
}
