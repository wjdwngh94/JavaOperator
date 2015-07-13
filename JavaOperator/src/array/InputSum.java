package array;

import java.util.Scanner;

/*
 * @Data : 2015.07.13
 * @Author : me
 * @Story : int형 배열 입력 예제
 */
public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum= 0, avg=0;
		
		System.out.println("3개의 점수를 입력하세요.");
		int[] arr = new int[3]; // 3개 숫자 저장 공간
		//배열에 값을 입력하라고 하면
		//무조건 for ctrl + space 부터
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			sum+=arr[i];
		}
		//arr[0] arr[1] arr[2]안에 for문으로 돌면서 입력됨
		
		System.out.println("3개의 입력된 점수는...");
		
		//입력된 값을 합산해 보세요
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"\t");
		}
		System.out.print("\n점수 총합 = " + sum);
		System.out.print("\n점수의 평균 = " + (sum/arr.length));
		//배열 객체.length = 길이 카운터 
	}
}
