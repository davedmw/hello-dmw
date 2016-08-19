class Person {
	// Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain 
    // 1. Data 
	// 2. Subroutines (methods)
	void speak() { //Lesson 14 - Methods
		System.out.println("My name is " + name + " and I am " + age + " years old!");
	} // End Speak
	
	void sayHello() { //Lesson 14
		System.out.println("Hello There!");
	}
	
	int calculateYearsToRetirement() { // Lesson 15 Methods with return variables.
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	
	int getAge() { // Lesson 15
		return age;
	}
	
	String getName() { // Lesson 15
		return name;
	}
}

public class Java_Classes {

	public static void main(String[] args) {
		// TODO Main for Java Classes
		
		// Lessons 13 and 14.
        Person person1 = new Person();
        person1.name = "Joey Negro";
        person1.age = 37;
        person1.speak();
        person1.sayHello();
        System.out.println();
        
        int years = person1.calculateYearsToRetirement();
        System.out.println("Years till retirement: " + years);
        
        String name = person1.getName();
        int age = person1.getAge();
        System.out.println("Name is: " +  name);
        System.out.println("Age is: " +  age);
        System.out.println();
        
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();
        person2.sayHello();
        
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);
	} // End Main

}
