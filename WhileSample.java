import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int count = 0, n=0;
		double sum = 0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
		while((n = scanner.nextInt()) != 0) {
			sum = sum + n;
			count++;
		}
		System.out.print("���� ������ " + count + "�� �̸�");
		System.out.println("����� " + sum/count + "�Դϴ�.");
	scanner.close();
	}

}
