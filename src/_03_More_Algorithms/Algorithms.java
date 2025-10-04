package _03_More_Algorithms;

import java.util.Iterator;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return null;
	}

	public static int findBrokenEgg(List<String> eggs) {
		int i = -1;
		for (String item : eggs) {
			i++;
			if (item.equals("cracked")) {
				return i;

			}
		}
		return 0;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (Boolean ya : oysters) {
			if (ya == true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallestPerson = 0;
		for (double thing : peeps) {
			if (thing > tallestPerson) {
				tallestPerson = thing;
			}
		}
		return tallestPerson;
	}

	public static Object findLongestWord(List<String> words) {
		int longestWordLength = 0;
		String longestWord = null;
		for (String jeff : words) {
			if (jeff.length() > longestWordLength) {
				longestWordLength = jeff.length();
				longestWord = jeff;
			}
		}
		return longestWord;
	}

	public static Object containsSOS(List<String> message1) {
		String target = "... --- ...";
		for (String jeff : message1) {
			if (jeff.contentEquals(target)) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size() - 1; j++) {
				if (results.get(j) > results.get(j + 1)) {
					double temp = results.get(j);
					results.set(j, results.get(j + 1));
					results.set(j + 1, temp);
				}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size() - 1; j++) {
				if (unsortedSequences.get(j).length() > unsortedSequences.get(j + 1).length()) {
					String tempWord = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j + 1));
					unsortedSequences.set(j + 1, tempWord);
				}
			}
		}

		return unsortedSequences;

	}

}
