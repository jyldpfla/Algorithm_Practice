package P1330;

import java.util.Scanner;

/**
 * 조건문
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교
 */
/*
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.
 * -10,000 ≤ A, B ≤ 10,000
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > B) {
			System.out.println(">");
		} else if (A == B) {
			System.out.println("==");
		} else {
			System.out.println("<");
		}
	}
}
