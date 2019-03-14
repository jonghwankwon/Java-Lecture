package sec04;

public class OverflowExample {

	public static void main(String[] args) {
		// ↓ 오버플로우 ↓
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		// ↓ 오버플로우 해결 ↓
		long lx = 1000000L;
		long ly = 1000000;
		long lz = lx * ly;
		System.out.println(lz);
	}

}
