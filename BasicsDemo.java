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
		System.out.println("\n\nInside primitives . . .");
		int intHex= 0x0041; // 16 power 0 *1 + 16 power 1 * 4
		System.out.println("intHex: " + intHex); 

		int intBinary = 0b0100_0001;
		System.out.println("intbinary: " + intBinary); 

		char charInt = 65; // cannot do -65
		System.out.println("charInt: " + charInt); 

		char charHex = 0x0041;
		System.out.println("charHex: " + charHex); 
		
		char charBinary = 0b0100_0001;
		System.out.println("charBinary: " + charBinary); 
	}

	public static void main(String[] args) {
		print();
		primitives();
	}
		

	// Disabled line
	/* Block code over multiple lines */ 

}