//Playing with enum and constructors

package usestudents;

import static java.lang.System.out;

public class UseStudents {

    public static void main(String[] args) {
	//New way using student subclass with getString() method
	StudentString student;

	//Try different constructors
	student = new StudentString();
	student.setGpa(145.6);
	student.setMajor(Major.COMPUTER_SCIENCE);
	out.println(student.getString());
	
	student = new StudentString(Major.LITERATURE);
	student.setGpa(562.75);
	out.println(student.getString());
	
	student = new StudentString(67.4);
	out.println(student.getString());
	
	student = new StudentString(104.76, Major.HISTORY);
	out.println(student.getString());

//	(This is the old way)
//
//	Student student;
//	final String format = "Name: %s\nID: %d\nGPA: %.2f\nMajor: %s\n\n";
//	
//	//Trying different constructors from Student class
//	student = new Student();
//	student.setGpa(145.6);
//	student.setMajor(Major.COMPUTER_SCIENCE);
//	out.printf(format, student.getName(), student.getId(),
//		student.getGpa(), student.getMajor());
//	
//	student = new Student(Major.LITERATURE);
//	student.setGpa(562.75);
//	out.printf(format, student.getName(), student.getId(),
//		student.getGpa(), student.getMajor());
//	
//	student = new Student(67.4);
//	out.printf(format, student.getName(), student.getId(),
//		student.getGpa(), student.getMajor());
//	
//	student = new Student(104.76, Major.HISTORY);
//	out.printf(format, student.getName(), student.getId(),
//		student.getGpa(), student.getMajor());

    }
    
}
