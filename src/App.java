
public class App {
	
	
	
	public static void main(String[] args) {
		
		/*
		Machine m1 = new Machine(); 
		m1.start(); 
		
		
		Person p1 = new Person("Axel");
		p1.greet();
		
		
		
		
		Info info1 = new Machine(); 
		info1.showInfo();
				
		
		Info info2 = p1; 
		info2.showInfo();
		
		*/
		
		
		
		
		Apple a1 = new Apple(12.3);
		Apple a2 = new Apple(13.3);
		
		Animal dog = new Animal(50.0);

		
		
		MaxWeightContainer mwc = new MaxWeightContainer(); 
		
		mwc.store(a1);
		mwc.store(a2);
		mwc.store(dog);
		
		Weighable heavyweight = mwc.getHeaviest();
		
		System.out.print(heavyweight.getWeight());
		
		
		
	}

}
