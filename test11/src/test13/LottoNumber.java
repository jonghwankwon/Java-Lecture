package test13;

import java.util.Arrays;
import java.util.Random;

//로또 (1~45 중 다른 6개 선택) 번호를 구해 정수 배열에 넣은 후 정수 배열의 참조 변수를
//리턴하는 프로그램을 작성
public class LottoNumber {
	public static void main(String[] args) {
		int[] lottoArray = getLottoNumber();
		System.out.println(Arrays.toString(lottoArray));
	}

	static int[] getLottoNumber() {
		int[] selectNumber = new int[6];	//선택 번호 5개가 저장될 배열 생성
		Random random = new Random(3);		//선택 번호를 얻기 위한 Random 객체 생성
		System.out.println("선택 번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;	//선택 번호를 얻어 배열에 저장
			System.out.println(selectNumber[i] + " ");
		}
		System.out.println();

		//당첨번호
		int[] winnerNumber = new int[6];		// 당첨 번호 6개가 저장될 배열 생성
		random = new Random(5);					// 당첨 번호를 얻기 위한 Random 객체 생성
		System.out.println("당첨 번호: ");
		for(int i=0; i<6; i++) {
			winnerNumber[i] = random.nextInt(45) + 1;	//당첨 번호 얻어 배열에 저장
			System.out.println(winnerNumber[i]);
		}
		System.out.println();

		//당첨여부
		Arrays.sort(selectNumber);//비교하기 전에 정렬시킴
		Arrays.sort(winnerNumber);
		boolean result = Arrays.equals(selectNumber, winnerNumber);	//배열 항목 값 비교
		System.out.println("당첨 여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
		return winnerNumber;

	}

}
