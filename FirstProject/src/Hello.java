
public class Hello {

	public static void main(String[] args) {
		//System.out.println("Hello");
		StringBuffer sb= new StringBuffer("Hello1");
		System.out.println(sb);
		sb.append("Java1");
		System.out.println(sb);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1= new StringBuilder("Hello2");
		System.out.println(sb1);
		sb1.append("Java2");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);

	}

}
