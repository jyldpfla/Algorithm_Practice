package p2739;

import java.util.Scanner;

/**
 * 반복문
 * 구구단
 */
public class Main {
	public static void main(String[] args) {
		int A;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.println(A+" * " + i + " = " + (A*i));
		}
	}
}
