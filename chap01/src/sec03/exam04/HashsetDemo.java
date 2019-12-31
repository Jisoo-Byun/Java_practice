package sec03.exam04;

import java.util.*;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		System.out.println(A.containsAll(C));
		System.out.println(A.containsAll(B));
		
		Iterator hi = A.iterator(); // interator라는 함수는 Iterator라는 객체를 return한다
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}
	static void iteratorUsingForEach(HashMap map) {
		Set<Map.Entry<K, V>>
	}
}
