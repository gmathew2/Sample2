package inheritance;

public class Manager extends Employee{

	int bonus=400;
	public void display()
	{
		System.out.println("Inside Manager Class Display method");
	}
	public static void main(String[] args) 
	{
		Manager m= new Manager();
		//m.basic_Salary=1500;
		//System.out.println("Basic Salary is: "+m.basic_Salary);
		m.display();
		Employee e=new Manager(); //upcasting
		e.display();

	}

}
