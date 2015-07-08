package variable;
/*
 * @Data : 2015.07.07
 * @Author : me
 * @Story : 데이터 입력
 */
import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력 하세요.");
		int kor = scanner.nextInt();
		
		System.out.println("영어 점수를 입력 하세요.");
		int eng = scanner.nextInt();
		
		System.out.println("수학 점수를 입력 하세요.");
		int math = scanner.nextInt();
		
		int total = kor + eng + math; // total 지역 변수를 연산식으로 초기화함
		System.out.println("총점 : " + total);
		
		
	}
}
