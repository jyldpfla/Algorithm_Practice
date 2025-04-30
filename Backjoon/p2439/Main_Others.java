package p2439;

import java.util.Collections;
import java.util.Scanner;

public class Main_Others {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 1
		String star = "";
		for (int i = 1; i <= N; i++) {
			star += "*";

			String space = "";
			int spaceCount = N - i;
			while (spaceCount-- > 0) {
				space += " ";
			}

			System.out.println(space + star);
		}
		
		// 2
		for (int i = 1; i <= N; i++) {
			System.out.println(
				// Collections.nCopies(count, str) : str을 count만큼 복사한 리스트 생성
				// String.join(delimiter, list) : 리스트의 요소들을 delimeter로 이어붙인 문자열로 만듦
				String.join("", Collections.nCopies(N - i, " ")) +
				String.join("", Collections.nCopies(i, "*"))
			);
		}
		
		// 3
		for (int i = 1; i <= N; i++) {
			// 공백 출력
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			// 별 출력
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// 줄 바꿈
			System.out.println();
		}
	}
}
