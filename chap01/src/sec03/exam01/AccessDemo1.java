package sec03.exam01;

class A {
	public String y() {
		return " y()";
	}
	private String z() {
		return " Z()";
	}
	public String x() {
		return z();
	}
}
abstract class B{
	public void d() {
		System.out.println("hello");
	}
}

public class AccessDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.y());
//		System.out.println(a.z());
		System.out.println(a.x());	
	}
}
