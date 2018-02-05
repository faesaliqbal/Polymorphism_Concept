package package1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * As all Cat and Dog objects are Animal objects, we can do the following:
		 * We can create a reference variable of parent type, and point it to the child object
		 */
		
		Animal a = new Dog();
		Animal b = new Cat();
		
		a.makeSound(); //output will be Dog sound
		b.makeSound(); //output will be Cat sound

	}

}
