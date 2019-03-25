package Openchallenge10_02;

public class Digital {
	public static void main(String[] args) {
		int h,m;
		int sec=0;

		for(h=0; h<24; h++)
			for(m=0; m<60; m++){
				if(h%10 == 3 || m%10 == 3 || m/10==3)
					sec  += 60;
			}
		System.out.println("3이 표시되는 시간을 합하면 :" + sec + " 초");
	}

}
