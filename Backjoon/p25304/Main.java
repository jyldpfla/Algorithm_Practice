package p25304;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 반복문
 * 영수증
 */
/*
 * 영수증에 적힌, 구매한 각 물건의 가격과 개수, 구매한 물건들의 총 금액을 보고,
 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사
 * 첫째 줄에는 영수증에 적힌 총 금액 X
 * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N
 * 이후 N개의 줄에는 각 물건의 가격 a와 b가 공백을 사이에 두고 주어짐
 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력
 * 1 <= X <= 1000000000, 1<= N <= 1000, 1 <= a <= 1000000, 1 <= b <=10
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = Integer.parseInt(sc.nextLine());
		int N = Integer.parseInt(sc.nextLine());
		ArrayList list = new ArrayList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			System.out.println(sc.nextInt());
		}
		System.out.println();
	}
}
