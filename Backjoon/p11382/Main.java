package p11382;

import java.util.Scanner;

/**
 * 입출력과 사칙 연산
 * 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
 */
/*
 * 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10의 12승)이 공백을 사이에 두고 주어진다.
 * 10의 12승은 long type
 * A+B+C의 값을 출력
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		System.out.println(A + B + C);
	}
}
