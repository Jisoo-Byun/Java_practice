package sec03.exam04;
class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
	public Fruit(){
		System.out.println("좋아요");
	}
	public void set() {
		System.out.println("음");
	}
}
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit type = Fruit.APPLE.BANANA.PEACH.APPLE;
		Fruit f = new Fruit();
		type.set();
	}
}
