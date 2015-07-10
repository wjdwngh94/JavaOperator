package condition;

import java.util.Scanner;

/*
 * @Data : 2015.07.09
 * @Author : me
 * @Story : 사칙 연산 계산 프로그램
 */
public class ArithmeticCalc {
	/*
	 * 오더 -사칙 연산 계산기 - 덧셈 뺄셈 곱셈 나눗셈(몫 :(), 나머지:()) - 사칙연산 기호도 입력받습니다. +, *, -, /
	 * 출력결과 === 심플 계산기 === 5 X 5 = 25 5 + 5 = 10 6 ÷ 5 = 1 (1) 5 - 6 = -1
	 */

	public void calc() {
		// float
		int a1 = 0, a2 = 0;
		int tmp = 0;
		String ari = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("===\t심플 계산기\t===");

		System.out.println("숫자를 입력해 주세요");
		a1 = scanner.nextInt();

		System.out.println("연산자를 입력해 주세요");
		ari = scanner.next();
		// scanner.netxtLine 은 긴 문장

		System.out.println("숫자를 입력해 주세요");
		a2 = scanner.nextInt();

		System.out.println(a1 + " " + ari + " " + a2 + " = ");

		if (ari.equals("+")) {
			tmp = a1 + a2;
			System.out.println(tmp);
		} else if (ari.equals("*")) {
			tmp = a1 * a2;
			System.out.println(tmp);
		} else if (ari.equals("/")) {
			tmp = a1 / a2;
			System.out.println(tmp + " (" + (a1 % a2) + ")");
		} else if (ari.equals("-")) {
			tmp = a1 - a2;
			System.out.println(tmp);
		} else {
			System.out.println("입력된 값이 올바르지 않습니다.");
		}
	}

}
