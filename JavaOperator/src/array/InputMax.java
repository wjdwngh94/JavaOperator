package array;

import java.util.Scanner;

/*
 * @Data : 2015.07.13
 * @Author : me
 * @Story : int 형 배열에서 입력값 중 최대값 구하기
 */
public class InputMax {
	public static void main(String[] args) {

		int[] arr = new int[3];
		// arr[0]=0;
		// arr[1]=0;
		// arr[2]=0;
		Scanner scanner = new Scanner(System.in);
		int tmp = 0; // 최대값을 담을 임의의 변수

		System.out.println("3개의 숫자를 입력하세요");

		tmp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (tmp < arr[i]) {
				tmp = arr[i];
			}
		}
		System.out.println("배열중 최대값은 " + tmp + " 입니다.");
	}
}
