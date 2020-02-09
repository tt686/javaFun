import java.lang.Math;
public class Pythagorean {
	public double calculateHypotnuese(int legA, int legB) {
		double legC = Math.sqrt((legA*legA) + (legB * legB)); // 2.0
		// return "The Answer is " + legC;
		return legC;
	}
}