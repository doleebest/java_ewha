import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0, n=0;
		
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try{
				n = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.print("정수를 넣으라고!");
				scanner.next(); // 들어와있는 잘못된 수 버리기
				i--;
				continue;
			}
			
			sum += n;
		}
	System.out.println("합은 "+sum);
	scanner.close();
	}

}
