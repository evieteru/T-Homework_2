package HW2;

public class Main {
    public static void main(String[] args) {
        StudentManager studentMgr = new StudentManager();
        
        // Should push a txt file on here then path it
        String dataFilePath = "studentData.txt";
        
        // Attempt to load student data
        boolean dataLoaded = studentMgr.readFromFile(dataFilePath);
        if (dataLoaded) {
            System.out.println("Data loaded successfully!");
            // Displaying all students to verify data load
            studentMgr.displayAllStudents();
        } else {
            System.out.println("Error occured!");
            // Exit if data fails to load
            return;
        }
        
        // Example student ID
        int studentId = 104;
        // Searching for student by ID + grade update
        boolean found = studentMgr.searchStudentById(studentId);
        if (found) {
            double newGrade = 90; 
            boolean updated = studentMgr.updateStudentGradeById(studentId, newGrade);
            if (updated) {
                System.out.println("Student grade has updated.");
            } else {
                System.out.println("Grade update has failed, check the student array again if its shifted by removing");
            }
        } else {
            System.out.println("Student not found, check it if its empty in array");
        }
        
        // Re-display if its updated
        studentMgr.displayAllStudents();
    }
}
