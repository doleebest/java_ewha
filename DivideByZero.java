import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int dividend; //나뉨수
		int divisor; //나눗수
		
		System.out.print("나뉨수를 입력하세요");
		dividend = scanner.nextInt();
		System.out.print("나눗수를 입력하세요");
		divisor = scanner.nextInt();
		
		
		try {
		System.out.println(dividend+"를"+divisor+"로 나누면 몫은"
				+ dividend/divisor+"입니다");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 못 나눠! 0 넣지마");
		}
		finally
		{
			scanner.close();
		}
		
	}

}
