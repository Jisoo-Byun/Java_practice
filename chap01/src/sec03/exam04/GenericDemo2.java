package sec03.exam04;

class EmployeeInfo{
	public int rank;
	public EmployeeInfo(int rank) {
		this.rank = rank;
		// TODO Auto-generated constructor stub
	}
}

class person1 <T,S>{
	public T info;
	public S id;
	public person1(T info, S id) {
		this.info = info;
		this.id = id;
	}
}

public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer id = new Integer(1);
		person1 <EmployeeInfo, Integer> p1 =new person1<EmployeeInfo,Integer>(new EmployeeInfo(1),id);
		System.out.println(p1.id.intValue());
	}

}
