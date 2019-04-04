package sec06_Array_Type;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);		
		System.out.println("scpres[2] : " + scores[2]);

		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
/*		(1)
	  	int sum = 0;
		for(int score: scores) {
			sum += score;
		}
		
		(2)
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}*/
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}

}