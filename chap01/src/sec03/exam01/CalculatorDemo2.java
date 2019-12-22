package sec03.exam01;
class Calculator {
	int left, right;
//	public Calculator() {
//		
//	}
	public Calculator(int left, int right) { //생성 
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator (int left, int right) {
		super(left, right); //부모클래스 생성자를 의미  
		//여기 부분에 자식클래스의 초기화 코드를 작성 super보다 위에 작성하면 안됨
	}
//	public void set(int left1, int right1) {
//		this.left1 = left1;
//		this.right1 = right1;
//	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator(10,20); // 생성자를 호출하는것
		c.sum();
		c.avg();
		
		SubstractionableCalculator c1 = new SubstractionableCalculator(200, 100);
//		c1.set(200, 100);
		c1.substract();
//		c1.sum();
		
		
	}

}
