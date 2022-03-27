import java.util.Scanner;

public class Twnties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//int x = 10;
		
		System.out.print("나이를 입력하시오");
		int age = scanner.nextInt();
		
		if((age >= 20) && (age < 30)) {//나이가 20~29
			System.out.print("20대입니다.");
			System.out.print("20대라서 행복합니다.");
		}
		else
		{
			System.out.println("20대가 아닙니다.");
		}
		
		scanner.close();
		
	}

}
