package soohwan.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt () {
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("원하는 달의 달력을 알려드립니다.");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			
			if(month == -1) {
				break;
			} else if(month > 12) {
				continue;
			}
			cal.printCalendar(2022, month);
		}
		
		System.out.println("The End");
		scanner.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}