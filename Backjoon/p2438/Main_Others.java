package p2438;

import java.util.Scanner;

public class Main_Others {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String s = ""; // 별 저장 변수
		
		// for문 하나로
		for(int i = 1; i <= N; i++) {
			s += "*";
			System.out.println(s);
		}
	}

}
