package soohwan.calendar;

import java.util.Scanner;

public class Calendar {
	private static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	public static void main(String[] args) {
//		System.out.println("일  월  화  수 목  금 토");
//		System.out.println("--------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		/* 조건문을 활용한 시도.. 실패
		String[] thirtymonth = {"4, 6, 9, 11"};
		String[] thirtyonemonth = {"1, 3, 5, 7, 8, 10, 12"};
		String elsemonth = "2";
		
		System.out.println("원하는 달의 수를 입력하시면 최대 일수를 알려드립니다.");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		System.out.println("사용자가 입력한 값은" + num +"입니다.");
		
		if(thirtymonth.equals(num)) {
			System.out.println("30");
		} else if(thirtyonemonth.equals(num)) {
			System.out.println("31");
		} else if(elsemonth.equals(num)) {
			System.out.println("28");
		}
		*/
	
		//반복문과 조건문을 활용하여 반복적으로 응답하기
		//while 과 for의 차이 ... while은 구체적 반복 횟수가 안 정해져 있을 때 사용하면 좋음
		Calendar cal = new Calendar();
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("원하는 달을 입력하시면 최대 일 수를 알려드립니다.");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			
			if(month == -1) {
				break;
			} else if(month > 12) {
				continue;
			}
			System.out.printf("%d월의 최대 일 수는 %d일 입니다.\n", month, cal.getMaxDaysOfMonth(month));
		}
		
		System.out.println("The End");
		scanner.close();
	}
}
