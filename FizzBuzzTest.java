
public class FizzBuzzTest {
	
	public static void main(String[] args) {
		
		FizzBuzz test = new FizzBuzz();
		String num1 = test.fizzBuzz(15);
		String num2 = test.fizzBuzz(3);
		String num3 = test.fizzBuzz(5);
		String num4 = test.fizzBuzz(2);

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}