package sec03.exam01;

class O{
	public void a (int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a (String param) {
		System.out.println("문자 출력");
		System.out.println(param);
	}
}
public class PolyoverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O o = new O();
		o.a(1);
		o.a("변지수");
	}
}
