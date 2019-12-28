package sec03.exam04;

class Names{
	String name;
	Names (String name) {
		this.name = name;
	}
	public boolean equals(Object obj) {
		Names s = (Names) obj; //이미 객체 생성되었기 때문에 new안써주고 변환N
		return this.name == s.name;
	}
}

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Names s1 = new Names("byun");
		Names s2 = new Names("byun");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));	
	}
}
