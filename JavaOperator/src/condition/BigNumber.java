package condition;
/*
 * @Data : 2015.07.10
 * @Author : me
 * @Story : if else 예제( 큰수 구하기 )
 */
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		/*
		 * 문제_학생 3명의 이름과 점수를 입력받아서 1등 출력 점수는 0점부터 100점 사이
		 * 
		 * 결과) 1등은 98점입니다.
		 *
		 * 힌트) a와 b 비교, b와 c비교, a와 c비교
		 */

		// 선언부
		int fir = 0, sec = 0, thr = 0;
		int tmp=0;
		Scanner scanner = new Scanner(System.in);

		// 연산부
		System.out.println("첫번 째 점수를 입력하여 주세요");
		fir = scanner.nextInt();
		System.out.println("두번 째 점수를 입력하여 주세요");
		sec = scanner.nextInt();
		System.out.println("세번 째 점수를 입력하여 주세요");
		thr = scanner.nextInt();

		/*
		 * if (fir>sec) {
		 * 
		 * tmp=fir; if(fir<thr){ tmp=thr; } } else { tmp=sec; if(sec<thr){
		 * tmp=thr; } }
		 */

		/*
		 * 조건식을 따져서 결과를 가정하지 말고, 결과를 상정한 다음 거기에 맞는 조건식을 설정하세요.
		 */

		if (fir > sec && fir > thr) {
			tmp = fir;
		} else if (sec > fir && sec > thr) {
			tmp = sec;
		} else if (thr > sec && thr > fir) {
			tmp = thr;
		} else {
			System.out.println("동점자가 존재합니다.");
		}

		// 출력부
		System.out.println("1등은" + tmp + "점입니다.");
	}
}
