package HW2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	Student[] students; // Use Student[] to store student objects.
	
	/** Read student data from a file using FileInputStream and Scanner.
	 * @param fileName string of file path & name of file
	 * @return true if file successfully read & initialized
	 * @return false if file can't read/find file OR initialize objects
	 */ 
	public boolean readFromFile(String fileName) {
		Scanner fileInput = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			fileInput = new Scanner(file);			
		}
		catch (FileNotFoundException error) { // If file not found
			return false;
		}
		
		ArrayList<Integer> ids = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> grades = new ArrayList<Double>();
		
		while (fileInput.hasNextLine()) {
			ids.add(fileInput.nextInt()); // Store id
			names.add(fileInput.next() + " " + fileInput.next()); // Store first last name
			grades.add(fileInput.nextDouble()); // Store grade	
			
			fileInput.nextLine(); // Move to next line
		}
		
		fileInput.close();
		
		students = new Student[ids.size()]; // Let students to be of ids' size
		
		for (int i = 0; i < students.length; ++i) {
			Student student = new Student(ids.get(i), names.get(i), grades.get(i));
			if (student != null) { 
				students[i] = student;  
			}
			else { // If student object initialization fails (student[index] = null still)
				return false;  
			}
		}
		
		return true;
	}
	
	public boolean updateStudentGradeById(int id, double grade) {
		
		if (searchStudentById(id) == false) {
				return false;
		}
		
		else {
			for(Student currentStudent : students) {
				if(currentStudent.getId() == id) {
					currentStudent.setGrade(grade);
					return true;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
