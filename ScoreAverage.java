
public class ScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double score[][] = {{3.3, 3.4},  //1학년 1학기, 2학기 평점
		                    {3.5, 3.6},  
		                     {3.7, 4.0},
		                     {4.1, 4.2}
	};
		double sum=0;
		for(int year = 0; year<score.length; year++)
			for(int term = 0; term<score[year].length; term++)
				sum+=score[year][term];
		
		int n = score.length; // 4
		int m = score[0].length; // 2
		System.out.println("4학년 전체의 평균은 "+sum/(n*m));
		
	}

}
