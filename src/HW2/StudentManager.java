package HW2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	
	
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
