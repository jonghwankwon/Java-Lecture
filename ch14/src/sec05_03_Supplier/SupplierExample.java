package sec05_03_Supplier;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
		int num = (int) (Math.random() * 6) + 1;
		return num;
		};	//람다식 7~10라인
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수 : " + num);
	}
}
