package HW2;

public class StudentManager {

	public void displayStudents() {
    int totalStudents = 0;
    for (Student student : students) {
        if (student != null) {
            totalStudents++;
        }
    }

    if (totalStudents == 0) {
        System.out.println("Error, check student ID, Null objects in array if something get removed and there are nothing in there");
    } else {
        System.out.println("Student List:");
        System.out.printf("%-5s%-15s%-10s%n", "ID", "Name", "Grade");
        System.out.println("###########################");
        for (Student student : students) {
            if (student != null) {
                System.out.printf("%-5d%-15s%-10.2f%n", student.getId(), student.getName(), student.getGrade());
            }
        }
        System.out.println("###########################");
        System.out.println("Total students: " + totalStudents);
    }
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
