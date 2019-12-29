package sec03.exam04;

class student implements Cloneable{
	String name ; 
	student(String name){
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st1 = new student("byun");
		try{student st2 = (student)st1.clone();
			System.out.println(st2.name) ;
		}catch(CloneNotSupportedException e) {
		e.printStackTrace();
		}
		
	}
}
