import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ 5�� �Է��ϼ���.");
		int sum = 0;
		for(int i =0; i<4; i++) {
			int n=scanner.nextInt();
			
			if(n<=0) {
				continue; // 0�̸� ī��Ʈ ����!
			}
			else 
				sum += n;
			
		}
		System.out.println("����� ���� "+sum);
		scanner.close();
	}

}
