package escape;

import java.util.Scanner;

public class EscapeDemo {
	public static void main(String[] args) {
		/*
		 * 문제, 홍길동 씨는 30세이고
		 * 김유신 씨는 25세 입니다.
		 * 홍길동 씨와 김유신 씨의 나이차를
		 * 출력하는데...
		 * "홍길동씨는 김유신씨보다 5세가 많습니다."
		 */
		Scanner scanner = new Scanner(System.in);
		
		//지역 변수 선언 부
		int  age = 0,hongAge =0,kimAge = 0;
		String hong = "", kim =""; // 리터럴("") 이름 디폴트 값
		
		
		//연산부
		System.out.println("이름을 입력하여 주세요.");
		hong = scanner.next();
		System.out.println("이름을 입력하여 주세요.");
		kim = scanner.next();
		//값입력 후 공간에 할당됨
		
		System.out.println(hong + "씨의 나이를 입력하세요.");
		hongAge = scanner.nextInt();
		System.out.println(kim + "씨의 나이를 입력하세요.");
		kimAge = scanner.nextInt();
		
		age=hongAge - kimAge;
		
		System.out.println(hong + "씨는\t" + kim + "씨 보다\t" +age+ "세가\n많습니다.");		
				// \t = tab  \n = 줄바꿈
		
		/*
		 * escape 문자 (\t, \n) 처럼 알파벳에 \를 첨부하여
		 * 특수한 기능을 나타내도록 한 문법이다.
		 * 많이 있지만 \t, \n만 알아도 무방.
		 */
	}
}
