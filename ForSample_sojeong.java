
public class ForSample_sojeong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum=0;
		
		for(i=1; i<=10; i++) {
			sum += i; // i가 증가하면서 sum에 추가
			System.out.print(i);
			
			if(i<=9) {
				System.out.print("+");
			}
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}

}
