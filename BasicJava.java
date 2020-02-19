import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

	public static void print1to255() { // #1) Print 1-255: write a method that prints all the numbers from 1 to 255
		for (int i = 1; i <= 255; i++) {
			System.out.println(i);
		}
	}

	public void printOdd1to255() { // #2) Print odd numbers b/w 1-255: wite the method
		for (int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public void printSum1to255() { // #3) Print Sum: write a method that prints the numbers from 0-255 and sum each number afterward
		int sum = 0;
		for (int i = 0; i <= 255; i ++) {
			sum += i;
			System.out.println("New number: " + i + " Sum: " + sum);
		}
	}

	public void iterateArray(int[] array) { // #4 Iterating through ann array: write a method
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void findMax(int[] array) { // #5 print max value in array. Must work with all numbers.
		int max = array[0];
		for (int element : array) {
			if (element > max) {
				max = element;
			}
		}
		System.out.println(max);
	}

	public void getAverage (int[] array) { // #6 print average of values in array. 
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		int avg = ((sum)/(array.length));
		System.out.println(avg);
	}

	public void arrayOddNumbers() { // #7 write a method that creates an array "y" with odd numbers 1-255.
		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int i = 0; i <= 255; i++) {
			if (i % 2 != 0) {
				y.add(i);
			}
		}
		System.out.println(y);
	}

	public void greaterThanY(int[] array, int y) { // #8 write a method that takes an array and returns the number of values from the array greater than a given value of "y"
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > y){
				counter += 1;
			}
		}
		System.out.println(counter);
	}

	public void squareValues(int[] array) { // #9 given any array, write a method that each array multiplies by itself. Give new array wtih values squared.
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * array[i];
			newArr.add(array[i]);
		}
		System.out.println(newArr);
	}

	public void eliminateNegativeNumbers(int[] array){
		ArrayList<Integer> newArr2 = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = 0;
			}
			newArr2.add(array[i]);
		}
		System.out.println(newArr2);
	}

	public void maxMinAvg(double[] array) {
		// ArrayList<Double> newArr3 = new ArrayList<Double>();
		double maxnum = array[0];
		double minnum = array[0];
		double sum = 0;
		// for (int i = 0; i < array.length; i++) {
		for (double i: array) {
			if (i > maxnum) {
				maxnum = i;
			}
			if (i < minnum) {
				minnum = i;
			}
			sum += i;
		}
		double avg = (sum/array.length);
		double[] newArr3 = {maxnum, minnum, avg};
		System.out.println(newArr3); // ***converting w/ Arrays.toString(newArr3) extremely important***
		// return newArr3;
	}
}