public class Casting {
	public static void main(String[] args) {
		// int i = 127;
		// byte b = (byte) i; // int > byte, use explicit cast to convert int to byte type. Always be aware of value when cast typing down

		byte b = 127;
		int i = b; // this is implicit casting so no issues going small to big (casting up)
		System.out.println(b);
	}

}