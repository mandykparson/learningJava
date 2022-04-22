class BasicsDemo {
	// printing to the console
	static void print() {
		int i = 6;
		int j = 2;
		System.out.println("\n\nInside print . . .");
		System.out.println("Hello, world!!");
		System.out.println();
		System.out.print("Goodbye");
		System.out.println("Hello Again,");
		System.out.print("  ");
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);
		
	}

	static void primitives() {
		System.out.println("\n\nInside primitives ..."); 
		// literals demo
		int intHex = 0x0041;
		System.out.println("intHex: " + intHex);
		int intBinary = 0b01000001;
		System.out.println("intBinary: " + intBinary);
		int intChar = 'A'; // holds decimal equivalent, which is 65
		System.out.println("intChar: " + intChar);
		int intUnderscore = 1_23_456;
		System.out.println("intUnderscore: " + intUnderscore);
		
		char charA = 'A';
		System.out.println("charA: " + charA);
		char charInt = 65;
		System.out.println("charInt: " + charInt);
		char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode1: " + charUnicode1);
		char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
		System.out.println("charUnicode2: " + charUnicode2);
		char charBinary = 0b01000001; // binary corresponding to decimal 65
		System.out.println("charBinary: " + charBinary);	  		  	  
	}

	static void typeCasting() {
		System.out.println("\nInside typeCasting ...");
		// Explicit casting
		long y = 42;
		//int x = y;
		int x = (int)y;
		
		// Information loss due to out-of-range assignment
		byte narrowdByte = (byte)123456;
		System.out.println("narrowdByte: " + narrowdByte); 
		
		// Truncation
		int iTruncated = (int)0.99;
		System.out.println("iTruncated: " + iTruncated); 
		
		// Implicit cast (int to long)
		y = x;
		
		// Implicit cast (char to int)
		char cChar = 'A';
		int iInt = cChar; 
		System.out.println("iInt: " + iInt);
		
		// byte to char using an explicit cast
		byte bByte = 65;
		cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
		System.out.println("cChar: " + cChar);
	}

	static void arrays() {
		System.out.println("\nInside arrays ...");
		// int[] scores = new int[4];
		// scores[0] = 90;
		// scores[1] = 70;
		// scores[2] = 80;
		// scores[3] = 100;
		int[] scores = new int[] {90, 70, 80, 100};
		System.out.println("Mid-Term 1: " + scores[0]);
		System.out.println("Mid-Term 2: " + scores[1]);
		System.out.println("Mid-Term 3: " + scores[2]);
		System.out.println("Mid-Term 4: " + scores[3]);

		//OPTION A
		// Student[] students = new Student[3];
		// students[0] = new Student();
		// students[1] = new Student();
		// students[2] = new Student(); 

		//OPTION B
		// Student[] students = new Student[] {new Student(), new Student(), new Student()};

		//OPTION C
		Student[] students = {new Student(), new Student(), new Student()};
		System.out.println("Student 1: " + students[0]);
		System.out.println("Student 2: " + students[1]);
		System.out.println("Student 3: " + students[2]);
	}

	static void twodArrays() {
		int[][] myArray = new int[4][2]; //[rows][colums]
		int[][] anotherArray = new int[][]{
			{9,11},
			{8, 90},
			{43, 88},
			{21, 84}
		};
	}

	public static void main(String[] args) {	
		// Language Basics 1
		//print();				
		//primitives();
		// typeCasting(); 
		// arrays();
		twodArrays();
	}       
}