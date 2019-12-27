package sec03.exam04;

class DivideException extends Exception{
	int left ,right;
	
	public DivideException() {
		super();
	}
	public DivideException(String message,int left,int right) {
		super(message);
		this.left = left;
		this.right = right;
	}
	public void stateleftright() {
		System.out.println(this.left);
		System.out.println(this.right);
	}
}

class Calculator1 {
	int left, right;
	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() throws DivideException{
		if(this.right == 0) {
			throw new DivideException("0으로 나눌 수 없습니다.",this.left,this.right);
		}		
		System.out.println(this.left/this.right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator1 C = new Calculator1();
		C.set(10, 0);
	
		try{C.divide();
		}
		catch(DivideException e) {
			System.out.println(e.getMessage());
			e.stateleftright();
		}
	}
	
}
