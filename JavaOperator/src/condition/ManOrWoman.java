package condition;

import java.util.Scanner;

/*
 * @Data : 2015.07.10
 * @Author : me
 * @Story : switch case 예제( 남여 성판별 ) - charAt(문자열에서 문자하나 리턴)메소드 활용
 */
public class ManOrWoman {
	
	//static 을 지운다 / 메인을 ssn으로 바꾼다. / 소괄호 안을 비워두면 
	//모듈화되어 다른 곳에서 ManOrWoman을 사용 할 수 있게 된다.
	
	public  void ssn() {
		Scanner scanner = new Scanner(System.in); //scanner 는 system.in 을 넣는다. pc안으로 받는것.
		System.out.print("주민 번호를 입력 하세요 : "); //예 800101-2123456 -앞자리가 2이면 여자 1이면 남자
		String ssn = "", msg ="";
		ssn = scanner.next(); //ssn 주민번호 약자
		
		/*
		 * charAt(n) 이 메소드는 0부터 시작하여 n번째 글자 하나만 출력(return)하는데 
		 * 프로그래밍에서는 리턴값(반환 값)이라고 한다.
		 */
		
		char ch = ssn.charAt(7); // ch에는 ssn에서 입력받은 문자중에서 7번쨰 문자를 할당 
		//즉 800101-2123456 에서는 2를 return 한다.
		
		/*
		 * ssn의 체계
		 * 1,3번 남자
		 * 2,4번 여자
		 * 5번 외국인
		 * 그 외 : 잘못된 입력
		 */
		
		switch (ch) { //기준값 입력-비교대상값
		// String type = "", char type = ''
		case '1':	 
		case '3':	 msg="남자"; // msg 의 type이 String 임으로.
		break;
		
		case '2':	 
		case '4':	 msg="여자"; 
		break;
		
		case '5':	 msg="외국인"; 
		break;

		default:  msg="잘못된 입력";
		break;
		}
		System.out.println(msg + " 입니다.");	
	}
}
