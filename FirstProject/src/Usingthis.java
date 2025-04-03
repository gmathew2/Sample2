
class Usingthis {

		int id;
		String name;
			
		public Usingthis()
		{
		
			this(12,"Noah");// to invoke constructor of current instance
			System.out.println("Inside Default Constructor");
		
		}

		public Usingthis(int id, String name)
		{
			
			//this();
			this.id=id; //this is used to refer to a current class instance variable when there is ambiquity, here variable names are same
			this.name=name;	
		
		}
		public void show()
		{
		
			System.out.println("Inside Show");
			System.out.println();
		
		}
		public void display()
		{
			System.out.println("ID is: "+id);
			System.out.println("Name is: "+name);
			this.show(); //to invoke a method using current instance
		}

	public static void main(String[] args) {
		
				Usingthis s1 =new Usingthis();
				Usingthis s2 =new Usingthis(1,"Muse");
				Usingthis s3 =new Usingthis(2,"Mike");
				s2.display();
				s3.display();

			}
		}



