package Openchallenge08_01;

public class MyCalcApp {
	public static void main(String[] args) {
		MyCalc myCalc = new MyCalc();
		int testX = 50;
		int testY = 13;
		
		System.out.println(testX + ", " + testY);
		System.out.println("add: " + myCalc.add(testX, testY));
		System.out.println();
		System.out.println();
	}
}

