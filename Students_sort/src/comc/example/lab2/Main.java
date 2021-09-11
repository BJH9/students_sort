package comc.example.lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		Student s = new Student();
		s.setNo(1);
		s.setName("홍길동");
		s.setAge(20);
		list.add(s);
		list.add(new Student(2, "철수", 22));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		list.remove(0);
		System.out.println("홍길동 삭제됨");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}

}
