package sec04;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// Exception:예외 // 혹시 Exception발생할지도 모르는 코드일 경우 try {...}catch(___ e){...} 사용
		try {
			int result = safeAdd(2000000000, 200000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}

}
