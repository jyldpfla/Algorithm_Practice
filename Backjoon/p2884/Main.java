package p2884;

import java.util.Scanner;

/**
 * 조건문
 * 알람 시계
 */
/*
 * 45분 일찍 알람 설정하기
 * 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것
 * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
 * 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
 * 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력)
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if (M < 45) {
			H = H != 0 ? H - 1 : 23;
			M = 60 - (45 - M);
		} else {
			M -= 45;
		}
		
		System.out.println(H + " " + M);
	}
}
// m이 45보다 작으면 h - 1 (h가 0이면 24 - 1 = 23이 되어야 함), m = 60 - (45 - m)
// m이 45보다 크면 h는 그대로, m - 45
