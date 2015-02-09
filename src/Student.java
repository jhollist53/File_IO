public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}

	@Override
	public String toString() {
		return name + " " + score;
	}

	
	
}
