package test;

public class MainApp {
	public static void main(String[] args) {
		Student s = new Student();
		
		int marks[] = s.getMarks();
		
		for(int i : marks)
			System.out.println(i);
		
		
		int m[] = {10, 20, 30, 40, 50};
		
		Student s1 = new Student(111, "A", m);
		
		int marks1[] = s1.getMarks();
		
		for(int i : marks1)
			System.out.println(i);
	}
}
