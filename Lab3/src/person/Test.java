package person;

public class Test {
	//test student class
	public static void main(String[] args) {
		Person pl = new Person("Jane", "181 University Ave.", 123456);
		System.out.println(pl.toString());
		Student sl = new Student("John", "89 University Ave.", 234567);
		sl.addGrade("ELEC 279", 97);
		sl.addGrade("ELEC 221", 68);
		System.out.println(sl.toString());
		sl.printGrades();
		
		GradStudent s2 = new GradStudent("Tom", "92 Reg. St.", 345678);
		System.out.println(s2.toString());
		s2.addGrade("ELEC 279", 97);
		s2.addGrade("ELEC 271", 88);
		s2.setComitteeNum(6);
		s2.addGrade("COMPI", "PASS");
		s2.addGrade("COMPII", "PASS");
		s2.addGrade("Thesis Defence first trial", "Fail");
		s2.addGrade("Thesis Defence second trial", "Fail");
		s2.printExamGrades();
		s2.printGrades();
	}
}
