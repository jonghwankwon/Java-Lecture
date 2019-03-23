package Openchallenge08_01;

public class MyCalc implements Calculator{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public double mul(int x, int y) {
		return x*y;
	}

}
