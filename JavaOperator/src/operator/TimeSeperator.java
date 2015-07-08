package operator;
import java.util.Scanner;
/*
 * @Data : 2015.07.08
 * @Author : me
 * @Story : 입력받은 초를 시간 분 초 단위로 환산하는 프로그램
 */
public class TimeSeperator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input=0 , second =0;
		int minute=0, hour=0; 
		System.out.println("구하고자 하는 시간(초)을 입력.");
		input = scanner.nextInt();
		
		//만약 입력받은 초 가 500 이라면
		//500 초를 60으로 나눈 나머지가 초
		//위 연산에서 나온 몫을 다시 60으로 나눈 나머지가 분
		//위 여산에서 나온 몫이 시
		second = input % 60;
		minute = (input / 60) % 60;
		hour = (input / 60) / 60;
		
		System.out.println("입력하신 "+input+"초는");
		System.out.println(hour + "시간" + minute + "분" + second + "초입니다.");
	}
}
