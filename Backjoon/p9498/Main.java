package p9498;

import java.util.Scanner;

/**
 * 조건문 - 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");			
		} else if (score >= 70) {
			System.out.println("C");			
		} else if (score >= 60) {
			System.out.println("D");			
		} else {
			System.out.println("F");			
		} 
	}
}
