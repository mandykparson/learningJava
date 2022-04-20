/*
	Instance & Static:
	- Declared at class-level 
	- Scope: Entire class
	- Gets default value
	- Cannot be re-initialized directly within class

	Instance: Represents object state

	- Values are unique to object
	- From outside class: Accessible via object reference

	Static:
	 
	- Values are unique to class ~ One copy per class (shared across objects)
	- From outside class: Accessible via Class Name or object reference

	Instance & static variables are also referred to as fields or attributes. Attributes is probably more commonly associated with instance variables. 
*/

class Student {
	// Variables hold state. These instance variables hold the state. We call them instance varialbes because they are all instances of the class. Instsance is a different term for object.  
	int id = 1000; // if you don't say what it's equal to, it gets a default of 0
	int nextID = id + 1;
	String name = "John";
	String gender = "male";
	int another; // from -2147483648 to 2147483647
	byte age = 18; // from -128 to 127
	short range = 165; // from -32768 to 32767
	long phone = 223_456_7890L; // 
	float gpa = 3.8f; // without the f, it automatically assigns a double
	double GPA = 3.8888888888888888888899999999999; // auto truncates to 15 digits
	// STICK WITH int OR double

	char degree = 'B'; // can hold a single character, including numbers and emojis. From 0 to 65535 It uses unicode which represents all chars in hexidecimal as UTF-16. unicode-table.com gives you the unicode for all chars. Represent as '\u0000'

	// boolean defaults to false
	boolean international = true;
	double tuitionFees = 12000.0, internationalFees = 5000.0; // you can declare multiples of one data type with a comma
	static int computeCount; // this is the third type of variable = static. They are specific to the class. 


	
	int minValue = Integer.MIN_VALUE;
	int maxValue = Integer.MAX_VALUE;

	void compute() {
		computeCount = computeCount + 1;
		if (international == true){
			tuitionFees = tuitionFees + internationalFees;
		}
		// these are local variables because they are local to the method
		another = 200; // remove the data type when re-initializing
		System.out.println("id: " + id);
		System.out.println("nextID: " + nextID);
		System.out.println("another: " + another);
		System.out.println("age: " + age);
		System.out.println("range:  " + range);
		System.out.println("phone: " + phone);
		System.out.println("Integer Min Value: " + minValue);
		System.out.println("Integer Max Value: " + maxValue);
		System.out.println("gpa: " + gpa);
		System.out.println("GPA: " + GPA);
		System.out.println("tuitionFees: " + tuitionFees);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.compute();
		System.out.println("Compute Count: " + computeCount);
	}
}