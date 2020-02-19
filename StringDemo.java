public class StringDemo {
	public static void main(String[] args) {
		String ninja = "Coding Dojo is Awesome!";
		int length = ninja.length();
		System.out.println("String Length is: " + length);
		String string1 = "My name is ";
		String string2 = "Michael";
		String string3 = string1.concat(string2);
		System.out.println(string3);
		// will output My name is Michael
		// "Welcome," + "ninja" + "!"; // displays " Weclome ninja!"
		String ninja2 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
		int a = ninja2.indexOf("ow");
		System.out.println(ninja2);
		System.out.println(a);
	}
}