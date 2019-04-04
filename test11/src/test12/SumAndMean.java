package test12;

//주어진 배열의 전체 항복의 합과 평균값을 구하는 프로그램을 중첩 for문을 사용해서 작성
public class SumAndMean {
	public static void main(String[] args) {
		int[][] intArray = {
				{95, 86, 88},
				{88, 92, 96, 85},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for(int i=0; i<intArray.length; i++) {
			for(int k=0; k<intArray.length; k++) {
				sum += intArray[i][k];
				count++;
			}
		}
		avg = (double)sum/count;
		
		System.out.println("총합은 : "+ sum);
		System.out.println("평균은 : "+ avg);
	}
}
