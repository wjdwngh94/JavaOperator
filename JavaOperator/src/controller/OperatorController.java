package controller;

import condition.ArithmeticCalc;
import condition.CalcAvg;
import condition.ManOrWoman;
import condition.SwitchAvg;
import loop.EvenOddSum; 
//대쉬보드 기능
public class OperatorController {

	public static void main(String[] args) {

		// 2015-07-09 성적 계산기
		CalcAvg avg = new CalcAvg();
		//avg.calcAvg();

		// 2015-07-09 사칙 연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
		//calc.calc();
		
		// 2015-07-10 불/합 여부 if else를 switch로 변환
		SwitchAvg avg2 = new SwitchAvg();
		//avg2.calc();
		
		//2015-07-10 switch와 charAt활용 (주민번호 / 남여외국인 )
		ManOrWoman manOrWoman = new ManOrWoman();
		//manOrWoman.ssn(); //ssn() 은 원래 클래스의 메소드 이름이다. 
		//로컬 valuable 
		
		//2015-07-13 for문과 if문으로 a-b홀짝합구하기
		EvenOddSum evenOddSum = new EvenOddSum();
		evenOddSum.calc(); // main 메소드가 있는 곳으로  calc를 불러온다.
	}
}
