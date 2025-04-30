package p2588;

import java.util.Scanner;

/**
 * 입출력과 사칙 연산
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *			472 (1)
 *	x		385 (2)
 *--------------
 *		   2360 (3)
 *		  3776  (4)
 *		 1416   (5)
 *--------------
 *		 181720 (6)
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */
/*
 * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어짐
 * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		
		int o = a * (b % 10);
		int t = a * ((b / 10) % 10);
		int h = a * (b / 100);
		
		System.out.println(o);
		System.out.println(t);
		System.out.println(h);
		System.out.println(h * 100 + t * 10 + o);
	}
}
