package Openchallenge07_02;

public class Customer {
	String name;
	String tel;
	String addr;

	public void show() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", tel=" + tel + ", addr=" + addr + "]";
	}
}