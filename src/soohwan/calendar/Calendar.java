package soohwan.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("일  월  화  수 목  금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		int[] thirtymonth = new int[30];
		int[] thirtyonemonth = new int[31];
		int[] elsemonth = new int[28];
		System.out.println("원하는 달의 수를 입력하시면 최대 일수를 알려드립니다.");
		Scanner scanner = new Scanner(System.in);
		boolean num;
		if(num = 1 || 3 || 5 || 7 || 10 || 12) {
		 System.out.println(thirtymonth.length);
		 }
	}
}
