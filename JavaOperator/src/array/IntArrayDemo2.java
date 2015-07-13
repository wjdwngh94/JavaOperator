package array;

import java.util.Scanner;

/*
 * @Data : 2015.07.13
 * @Author : me
 * @Story : int형 배열 예제
 */
public class IntArrayDemo2 {
	public static void main(String[] args) {
		/*
		 * 자바 배열의 특징
		 * 1. 배열은 0부터 인덱스 번호가 시작된다.
		 * 2. 배열의 크기 = 배열의 요소의 갯수와 같다.
		 * 3. 배열은 크기가 고정되어 있으며 요소를 추가할 수 없다.
		 * 4. 배열은 한가지 타입만 지정할 수 있다.
		 */
		
		int[] arr = new int[3]; //대괄호 안은 사이즈(요소 갯수) -> 숫자변수 3개배열
		
		arr[0] = 1; //첫번 째 칸
		arr[1] = 2; //두번 째 칸에 숫자 2를 담는다.
		arr[2] = 3;
		//arr[3] = 4; 이것은 지금은 에러 표시를 하지 않지만 , 실해시 에러가 발생한다.
		//사이즈를 결정하는 순간 그 크기는 변경이 불가하다
		//배열은 선언순간 0 으로 초기화 되어 있다.
		//그리고 0부터 시작한다.
		for (int  i= 0;  i< arr.length; i++) {
			//arr은 바로 직전에 설정한 객체(배열)의 이름
			//new int로 만든 객체(메소드를 호출할 수 있는)
			//자동적으로 arr.length 는 3이 된다.
			System.out.print("arr[" +(i)+"]" + " = " +(arr[i]) +"\t");
		}
		int[] b = new int[100]; //객체는 new를 호출 하여야 한다.
		//int[] int를 담는 큰 공간이 필요하다 []
		//아래와 순서 비교
		//Scanner scanner = new Scanner(System.in);
	}
}
