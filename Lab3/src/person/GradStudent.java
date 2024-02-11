package person;

public class GradStudent extends Student{
	private int numComitteeMemb;
	private int numExamsTaken;
	private String[] gExamNames;
	private String[] gExamResults;
	private static int numOfAttempts = 6;
	
	//constructor
	public GradStudent(String name, String address, int ID) {
		super(name, address, ID);
		this.numComitteeMemb = 0;
		this.numExamsTaken = 0;
		this.gExamNames = new String[numOfAttempts];
		this.gExamResults = new String[numOfAttempts];
	}
	
	//methods for number of comittee members
	//mutator
	public void setComitteeNum(int num) {
		this.numComitteeMemb = num;
	}
	//accessor
	public int getComitteeNum() {
		return numComitteeMemb;
	}
	
	//adds exam and grade to arrays, overides parent class' definition
	public void addGrade(String examName, String examResult) {
		this.gExamNames[numExamsTaken] = examName;
		this.gExamResults[numExamsTaken] = examResult;
		numExamsTaken = numExamsTaken + 1;
	}
	
	//toString method which overrides Students method
	public String toString() {
		return "Grad_" + super.toString();
	}
	
	//print exam results
	public void printExamGrades() {
		for(int i = 0; i < numExamsTaken; i++) {
			System.out.println(gExamNames[i] + ": " + gExamResults[i]);
		}
	}
}
