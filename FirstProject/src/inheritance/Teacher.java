package inheritance;

public class Teacher extends Employee{

	int hra=500;
	public static void main(String[] args) {
		Teacher t= new Teacher();
		System.out.println("Total Salary of the Teacher is: "+(t.basic_Salary+t.hra));
		t.display();
	}

}
