package p2480;

import java.util.Scanner;

/**
 * 조건문 
 * 주사위 세 개
 */
/*
 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임
 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 * 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
 * 첫째 줄에 게임의 상금을 출력 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int prize = 0;
		
		if (a == b && b == c) {
			prize = 10000 + a * 1000;
		} else if ((a == b) || (b == c) || (a == c)) {
			prize = (a == b || a == c) ? 1000 + a * 100 : 1000 + b * 100;
		} else {
			prize = Math.max(Math.max(a, b), Math.max(a, c)) * 100;
		}
		
		System.out.println(prize);
	}
}
// point - 3개의 수 중 2개만 같을 때를 간략하게
// a가 같은 수인지 확인, 아니면, b와 c가 같은 수
