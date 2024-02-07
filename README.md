#HW2
// I work on Display students function



Define classes: (Wen)
// 1-student class
// 2-studentmanager class


Readfile: 
check example on readfile week2:
https://github.com/MU-CS3330/SP2024-class-codes/blob/main/week2M-BasicIOOperationsReadFromFile/src/edu/mu/App.java

Display students: (Thomas)
// public void displayStudents() -> toString() from student class

Search students: (A)
// search by ID. StudentID.equals()
//Method signature:
public boolean searchStudentById(int id)
o Return true if student ID was found.
o Return false if student ID was not found

//what if studentID has int?? can we use .get() => 1. if ID is an int, then we can use it to compare. Otherwise, if ID is not prim int, equal() is better. Search student class -> super -> id. Alos, memory location is better so we use equals() to help cover objects identical or not. get() can only do only exit, True & false
Update student: (Evie)
