package test;

public class Student {
	private int id;
	private String name;
	private int marks[];

	public Student() {
		id = 0;
		name = "";
		marks = new int[5];
		
	//	for(int i = 0; i < marks.length; i++) 
	//		marks[i] = 0;
	}
	
	public Student(int id, String name, int[] marks) {
		this.id = id;
		this.name = name;
		
		this.marks = new int[5];
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
}
