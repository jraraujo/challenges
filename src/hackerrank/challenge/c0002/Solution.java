package hackerrank.challenge.c0002;

import java.util.Scanner;

/**
 * Circular Array Rotation 
 * 
 * Site: Hackerrank Challenge
 * Link: https://www.hackerrank.com/challenges/circular-array-rotation/problem
 * Difficult: Easy
 * Submission: 001 
 * 
 * @author zehh_junior
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] m = new int[q];
		for (int m_i = 0; m_i < q; m_i++) {
			m[m_i] = in.nextInt();
		}
		int[] result = circularArrayRotation(a, k, m);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
		in.close();
	}

	//I think this could be better. Maybe It could go once through one vector only. 
	static int[] circularArrayRotation(int[] givenArray, int numberOfRotations, int[] positionsToReturn) {
		//Rotates the array
		int[] rotatedArray = rotateArray(givenArray, numberOfRotations);
		
		//get items to show
		int[] finalArray = new int[positionsToReturn.length];
		for (int i = 0; i < positionsToReturn.length; i++) {
			finalArray[i] = rotatedArray[positionsToReturn[i]];
		}
		return finalArray;
	}

	private static int[] rotateArray(int[] givenArray, int numberOfRotations) {
		numberOfRotations = numberOfRotations % givenArray.length;
		int[] rotatedArray = new int[givenArray.length];
		for (int i = 0; i < givenArray.length; i++) {
			int newLocation = (i + numberOfRotations < givenArray.length ? i + numberOfRotations
					: i + numberOfRotations - givenArray.length);
			rotatedArray[newLocation] = givenArray[i];
		}
		return rotatedArray;
	}
}