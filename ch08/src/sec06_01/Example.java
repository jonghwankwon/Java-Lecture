package sec06_01;

public class Example {
	public static void main(String[] args) {
		IpmlementationC impl= new IpmlementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
