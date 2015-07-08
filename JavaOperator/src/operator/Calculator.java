package operator;
import java.util.Scanner;
/*
 * @Data : 2015.07.08
 * @Author : me
 * @Story : 계산
 */
public class Calculator {
	public static void main(String[] args) {
		/*
		 * order
		 * 스캐너로 두 값을 입력받아서
		 * 사칙연산 결과가 나오도록 하시오
		 */
		
		//선언부
		Scanner scanner = new Scanner(System.in);
		int x=0, y=0, add=0, gob=0, 
				sub=0, nmg=0, mog=0; //지역변수는 디폴트 값을 초기화 한다.
		
		System.out.println("x 값을 입력하여 주세요.");
		x = scanner.nextInt(); //next는 커서 다음 글자(숫자)를 변수에 할당하라는 의미
		System.out.println("y 값을 이력하여 주세요.");
		y = scanner.nextInt();
		System.out.println("입력 받은 값은\n"+x+" 와 "+y+" 입니다.");
		
		add=x+y;
		gob=x*y;
		sub=x-y;
		mog=x/y;
		nmg=x%y;
		
		System.out.println("\n사칙 연산 결과는");
		System.out.println(x+" + "+y+" = "+ (x+y));
		System.out.println(x+" * "+y+" = "+ gob);
		System.out.println(x+" / "+y+" = "+ mog);
		System.out.println(x+" % "+y+" = "+ nmg);
		System.out.println(x+" - "+y+" = "+ sub);
	}
}
