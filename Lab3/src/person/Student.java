package person;

public class Student extends Person{
	private int numCoursesTaken;
	private String [] courseCodes;
	private int [] grades;
	private static int maxCourses = 20;
	
	//constructor
	public Student(String name, String address, int ID) {
		super(name, address, ID);
		this.numCoursesTaken = 0;
		this.courseCodes = new String[maxCourses];
		this.grades = new int[maxCourses];
	}
	
	//toString method
	public String toString() {
		return "Student: " + super.toString(); 
	}
	
	//adds a course taken to the courseCode array and course grade to courseGrade array
	public void addGrade(String courseCode, int courseGrade) {
		this.courseCodes[numCoursesTaken] = courseCode;
		this.grades[numCoursesTaken] = courseGrade;
		numCoursesTaken = numCoursesTaken + 1;
	}
	
	//prints grades out of taken courses
	public void printGrades() {
		for(int i = 0; i < numCoursesTaken; i++) {
			System.out.println(this.courseCodes[i] + ": " + this.grades[i]);
		}	
	}
}
