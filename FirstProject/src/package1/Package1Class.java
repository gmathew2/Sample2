package package1;

public class Package1Class {

	 protected void display()
	{
		System.out.println("Inside Display");
	}
	 protected static void get()
	{
		System.out.println("Inside Get");
	}
	public static void main(String[] args) {
		
		
		Package1Class p = new Package1Class();
		p.display();
		Package1Class.get();
	}

}

