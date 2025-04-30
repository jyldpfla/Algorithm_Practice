package p2438;

import java.util.Scanner;

/**
 * 입출력과 사칙 연산
 * 별 찍기
 */
/*
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍기
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
