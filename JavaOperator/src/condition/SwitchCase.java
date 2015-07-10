package condition;
/*
 * @Data : 2015.07.10
 * @Author : me
 * @Story : switch 예제( 기초 )
 */
public class SwitchCase {
	public static void main(String[] args) { //main 이 있어야 콘솔이 출력가능
		
		int flag =3; // flag라는 변수는 기준 값이라는 의미로 스위치 문에서 조건제어 변수로 많이 사용됨
		
		switch (flag) { //선언부에 있던 변수를 () 안에두고
		
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
		case 3: System.out.println("3"); break;
		
		//case 값은 중복 불가
		//line copy : ctrl : j
		
		default: System.out.println("1 부터 3 범위 밖의 숫자"); break;
		
		}
		
	}
}
