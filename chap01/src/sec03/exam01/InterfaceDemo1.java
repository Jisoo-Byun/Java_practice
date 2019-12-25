package sec03.exam01;

interface I {
	public void z();
}

class Allloc implements I {
	public void z() {
		System.out.println("Z()");
	}
}


public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Allloc a = new Allloc();
		a.z();
		
	}

}
