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
