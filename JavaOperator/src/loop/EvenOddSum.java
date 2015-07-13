package loop;

import java.util.Scanner;

public class EvenOddSum {
	public  void calc() {
		//static 지우고 main이름 바꾸고 소괄호 안에 지우고
		int a=0, b=0, evenSum=0, oddSum=0;
		Scanner scanner = new Scanner(System.in);
		
		//홀수 if(input % 2 == 1)
		//else
		
		System.out.println("a를 입력하여 주세요");
		a= scanner.nextInt();
		System.out.println("b를 입력하여 주세요");
		b= scanner.nextInt();
		
		for (int j = a; j <= b; j++) {
			
			if ((j%2)==0){
				evenSum+=j;
			}
			else{
				oddSum+=j;
			}
		}
		
		System.out.println(a+" 부터 " +b+" 까지의 정수 중에서");
		System.out.println("짝수의 합은 " +evenSum+" 이고\n홀수의 합은 " +oddSum+" 입니다.\n");
	}
}
