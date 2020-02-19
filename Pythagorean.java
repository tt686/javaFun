import java.lang.Math;
public class Pythagorean {
	public double calculateHypotnuese(int legA, int legB) {
		double legC = Math.sqrt((legA*legA) + (legB * legB)); // 2.0
		// return "The Answer is " + legC;
		System.out.println("The alternative code for this answer is " + legC);
		return legC;
	}
}