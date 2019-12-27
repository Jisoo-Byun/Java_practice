package sec03.exam04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B {
	void run() throws FileNotFoundException,IOException{
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("12344.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
	
}

class C{
	void run() throws FileNotFoundException, IOException {
		B b = new B();
		try {
			b.run();
		} catch (FileNotFoundException e) {
			System.out.println("B에서 예외처리");
		} catch (IOException e) {
			e.printStackTrace();
		} 	
	}
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("A에서 예외처리");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
