package calculator.biz;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("첫번째 숫자를 입력하세요: ");
			int x = scan.nextInt();
			System.out.print("연산자를 입력하세요: ");
			String oper = scan.next();
			System.out.print("두번째 숫자를 입력하세요: ");
			int y = scan.nextInt();
			Calculation cal = new Calculation();
			switch(oper) {
			case "+" :
				cal.add(x, y);
			break;
			case "-" :
				cal.sub(x, y);
			break;
			case "/" :
				cal.mul(x, y);
			break;
			case "*" :
				cal.div(x, y);
			break;
			default :
				System.out.println("연산자를 잘못입력했습니다.");
			}
		}
	}
}
