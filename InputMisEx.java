import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum = 0, n=0;
		
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try{
				n = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.print("������ �������!");
				scanner.next(); // �����ִ� �߸��� �� ������
				i--;
				continue;
			}
			
			sum += n;
		}
	System.out.println("���� "+sum);
	scanner.close();
	}

}
