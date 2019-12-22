package sec03.exam01;

class C {
	int v = 10;
	void m() {
		int v =20;
		System.out.println(v);
		System.out.println(this.v);
	} //위 V는 20 아래 V는 10 출력하고 싶다면 어떻게 하면될까
//		this를 붙이면 된다
}

public class thisdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
