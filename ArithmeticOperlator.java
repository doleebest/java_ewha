import java.util.Scanner;

public class ArithmeticOperlator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner;
		// int x;
		
		scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���");
		int time = scanner.nextInt();
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.print(time+"�ʴ� ");
		System.out.print(hour+"�ð�, ");
		System.out.print(minute+"��, ");
		System.out.print(second+"���Դϴ�. ");
		
		scanner.close();
	}

}
