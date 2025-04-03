package inheritance;

public class HrManager extends Manager {

	public static void main(String[] args) {
		
		HrManager hm=new HrManager();
		
		System.out.println("Total salary of the employee is: "+(hm.basic_Salary+hm.bonus));
	}

}
