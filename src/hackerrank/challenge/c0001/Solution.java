package hackerrank.challenge.c0001;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Designer Pdf Viewer 
 * 
 * Site: Hackerrank Challenge 
 * Link: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 * Difficult: Easy
 * Submission: 001 
 * 
 * @author zehh_junior
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
    
	static int designerPdfViewer(int[] lettersHeight, String word) {
		Map<Character, Integer> mapLetters = createMapLetters(lettersHeight);

		// calculate height
		int height = 0;
		for (char ch : word.toCharArray()) {
			int letterHeight = mapLetters.get(ch);
			if (letterHeight > height) {
				height = letterHeight;
			}
		}

		// calculate length
		int length = word.length();

		// return area
		return height * length;
	}

	private static Map<Character, Integer> createMapLetters(int[] lettersHeight) {
		Map<Character, Integer> map = new HashMap<Character, Integer>(26);
		map.put('a', lettersHeight[0]);
		map.put('b', lettersHeight[1]);
		map.put('c', lettersHeight[2]);
		map.put('d', lettersHeight[3]);
		map.put('e', lettersHeight[4]);
		map.put('f', lettersHeight[5]);
		map.put('g', lettersHeight[6]);
		map.put('h', lettersHeight[7]);
		map.put('i', lettersHeight[8]);
		map.put('j', lettersHeight[9]);
		map.put('k', lettersHeight[10]);
		map.put('l', lettersHeight[11]);
		map.put('m', lettersHeight[12]);
		map.put('n', lettersHeight[13]);
		map.put('o', lettersHeight[14]);
		map.put('p', lettersHeight[15]);
		map.put('q', lettersHeight[16]);
		map.put('r', lettersHeight[17]);
		map.put('s', lettersHeight[18]);
		map.put('t', lettersHeight[19]);
		map.put('u', lettersHeight[20]);
		map.put('v', lettersHeight[21]);
		map.put('w', lettersHeight[22]);
		map.put('x', lettersHeight[23]);
		map.put('y', lettersHeight[24]);
		map.put('z', lettersHeight[25]);
		return map;
	}

}
