package sec03.exam01;

class Calculator2 {
	int left ,right;
	int third;
	
	public void setOprands(int left, int right) {
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}
	public void setOprands(int left, int right , int third) {
		System.out.println("setOprands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
	}
	public void sum() {
		System.out.println(this.left+this.right+this.third);
	}
	public void avg() {
		System.out.println((this.left+this.right+this.third)/2);
			
	}
}

public class CalculatorDemothird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 c = new Calculator2();
		c.setOprands(1,2);
		c.sum();
		c.avg();
	}

}
