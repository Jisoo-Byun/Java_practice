package sec03.exam01;

class Acod{
	public String a () {
		return "A.x";	
	}
}
class Bcod extends Acod{
	public String a() {
		return "B.x";
	}
	public String b() {
		return "b";
	}		
}
public class PolyextendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acod a = new Bcod();
		System.out.println(a.a());
	}
}
