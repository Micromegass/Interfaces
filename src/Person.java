
public class Person implements Info {

	private String name;	
	
	
	
	public void showInfo() {

		System.out.print("name is: " + name);
		
	}
	
	
	
	public Person(String name) {
		this.name = name;
	}




	public void greet() {
		
		System.out.println("Hello" + name);
		
	}




	
}
