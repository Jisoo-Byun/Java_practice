package sec03.exam01;

public class Scopedemo {
	
	static void a() {
		int i = 0;
	}
//static void a()라는 메소드 속의 i는 a() 메소드 안에서만 유효하
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5;i++) {
			a();
			System.out.println(i);
		}
		
	}

}
