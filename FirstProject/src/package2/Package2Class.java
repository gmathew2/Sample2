package package2;

import package1.Package1Class;

public class Package2Class extends Package1Class {

	public static void main(String[] args) {
		Package2Class p2=new Package2Class();
		p2.display();
		Package1Class.get();
	}

}
