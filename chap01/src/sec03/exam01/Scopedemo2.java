package sec03.exam01;

public class Scopedemo2 {
	static int i ;
	
	static void a() {
		i = 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5;i++) {
			a();
			System.out.println(i);
		}
		//여기서 for문의 i는 뒤에 있는 {}안에서 지역변수로 동 
	}


}

