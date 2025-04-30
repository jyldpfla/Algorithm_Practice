package p10950;

import java.util.Scanner;

/**
 * 반복문
 * A+B를 출력
 */
public class Main {
	public static void main(String[] args) {
		int T;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt(); // 반복횟수
		for(int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A + B);
		}
	}
}
