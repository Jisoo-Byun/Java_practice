package sec03.exam03;
interface I1{
	public void A1(); 
}
interface I2{
	public void B1();
}

class C1 implements I1,I2{
	public void A1() {
		System.out.println("A");
	}
	public void B1() {
		System.out.println("B");
	}
	public void C12() {
		System.out.println("C");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj = new C1();
		I1 obj1 = new C1();
		I2 obj2 = new C1();
		obj.A1();
		obj.B1();
		obj1.A1();
//		obj1.B1();
		obj2.B1();
//		obj2.A1();
		
	}

}
