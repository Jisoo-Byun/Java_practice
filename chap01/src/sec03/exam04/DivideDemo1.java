package sec03.exam04;

class Calculator{
	int left , right;
	public void set(int left,int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		try{System.out.print("나누기 결과는");
		System.out.print(this.left/this.right);
		System.out.print("입니다.");}
		catch(Exception t) {
			System.out.print("오류가 발생했습니다."+t.getMessage());
		}
	}
}

public class DivideDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator A = new Calculator();
		A.set(10,0);
		A.divide();
	}

}
