package package1;

public class Cat extends Animal{
	
	/*
	 * Method Overriding AKA Run Time Polymorphism
	 * Method Overriding is also known as Runtime polymorphism.
	 * A child class can define a behavior that's specific to the subclass type.
	 * This means that a subclass can implement a parent class method based on its own requirement.
	 */

	/*
	 * Rules for Method Overriding:
	 * should have the same return type and arguments
	 * method access level can not be more restrictive than the overridden method's access level
	 * Example:
	 * if the superclass method is declared public, the overriding method in the subclass can be neither private nor protected
	 * 
	 * A method declared final or static can not be overridden
	 * If a method can not be inherited, it can not be overridden
	 * Constructors can not be overridden
	 */

	
	//Method Overriding
	public void makeSound(){
		System.out.println("Cat sound");
	}
	
	
	/*
	 * Method Overloading AKA Compile Time Polymorphism
	 * Method Overloading is also known as Compile Time Polymorphism
	 * When methods have the same name, but different parameters.
	 * It is useful when you need the same method functionality for different types of parameters.
	 */
	
	/*
	 * Rules for Method Overloading:
	 * An overloaded method must have a different argument list; the parameters should differ in their type,number or both
	 */
	
	//Method Overloading
	public int max(int a, int b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
	
	public double max(double a, double b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
}
