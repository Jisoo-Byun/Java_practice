package sec03.exam04;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}
class EmployInfo{
	public int rank;
	EmployInfo(int rank){
		this.rank = rank;
	}
}
class person{
	public Object info;
	person(Object info){
		this.info = info;
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1= new person("부장");
		EmployInfo ei = (EmployInfo) p1.info;
		System.out.println(ei.rank);
	}
}
