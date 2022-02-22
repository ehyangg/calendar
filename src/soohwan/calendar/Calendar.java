package soohwan.calendar;

import java.util.Scanner;

public class Calendar {
	private static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printCalendar(int year, int month) {
		System.out.printf("   <<%4d년%2d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		int maxdays = getMaxDaysOfMonth(month);
		for(int i = 1; i<=maxdays; i++) {
			System.out.printf("%3d", i);
			if((i % 7) == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

		/*
		 * 조건문을 활용한 시도.. 실패 String[] thirtymonth = {"4, 6, 9, 11"}; String[]
		 * thirtyonemonth = {"1, 3, 5, 7, 8, 10, 12"}; String elsemonth = "2";
		 * 
		 * System.out.println("원하는 달의 수를 입력하시면 최대 일수를 알려드립니다."); Scanner scanner = new
		 * Scanner(System.in); String num = scanner.next();
		 * System.out.println("사용자가 입력한 값은" + num +"입니다.");
		 * 
		 * if(thirtymonth.equals(num)) { System.out.println("30"); } else
		 * if(thirtyonemonth.equals(num)) { System.out.println("31"); } else
		 * if(elsemonth.equals(num)) { System.out.println("28"); }
		 */

	}
}
