import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int dividend; //������
		int divisor; //������
		
		System.out.print("�������� �Է��ϼ���");
		dividend = scanner.nextInt();
		System.out.print("�������� �Է��ϼ���");
		divisor = scanner.nextInt();
		
		
		try {
		System.out.println(dividend+"��"+divisor+"�� ������ ����"
				+ dividend/divisor+"�Դϴ�");
		}
		catch(ArithmeticException e) {
			System.out.println("0���� �� ����! 0 ������");
		}
		finally
		{
			scanner.close();
		}
		
	}

}
