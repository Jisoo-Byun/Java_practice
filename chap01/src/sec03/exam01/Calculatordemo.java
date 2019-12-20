package sec03.exam01;

class Calculator1{
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
}

public class Calculatordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1.sum(1, 2);
		Calculator1.avg(10, 20);
		
	}

}
