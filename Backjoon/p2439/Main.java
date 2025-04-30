package p2439;

import java.util.Scanner;

/**
 * 입출력과 사칙 연산
 * 별 찍기 2
 */
/*
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별을 출력
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String star = ""; 
		
		for(int i = 1; i <= N; i++) {
			star += "*";
			String space = " ".repeat(N - i); // repeat Java 11 함수
			System.out.println(space + star);
		}
	}
}
