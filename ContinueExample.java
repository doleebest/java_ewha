import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		int sum = 0;
		for(int i =0; i<4; i++) {
			int n=scanner.nextInt();
			
			if(n<=0) {
				continue; // 0이면 카운트 안함!
			}
			else 
				sum += n;
			
		}
		System.out.println("양수의 합은 "+sum);
		scanner.close();
	}

}
