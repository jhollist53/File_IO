import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	private ArrayList <Student> students;

	public void loadDataFromFile (String fin) {
		students = new ArrayList <Student>();
		FileReader reader;
		try {
			reader = new FileReader(fin);
			Scanner in = new Scanner(reader);
			while (in.hasNextLine()) {
				Student student = new Student(in.nextLine(), Integer.parseInt(in.nextLine()));
				students.add(student);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
		}
	}

	public void printInOrder() {
		Collections.sort(students);
		System.out.println("Student Scores List");
		for (Student s : students) {
			System.out.println(s);
		}
	}

	public void processFiles() {
		loadDataFromFile("scores.txt");
		printInOrder();
	}

	public static void main(String[] args) {
		ScoreTrakker processFiles = new ScoreTrakker();
		processFiles.processFiles();

	}
}
