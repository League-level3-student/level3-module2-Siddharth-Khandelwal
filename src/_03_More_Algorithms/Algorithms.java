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
    	   if(item.equals("cracked")) {
			return i;
			
		}
	}
    	return 0;
    }

	public static Object countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (Boolean ya: oysters) {
			if(ya == true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallestPerson = 0;
		for (double thing : peeps) {
			if(thing>tallestPerson) {
				tallestPerson = thing;
			}
		}
		return tallestPerson;
	}

	public static Object findLongestWord(List<String> words) {
		int longestWordLength = 0;
		String longestWord = null;
		for(String jeff: words) {
			if(jeff.length()>longestWordLength) {
				longestWordLength = jeff.length();
				longestWord = jeff;
			}
		}
		return longestWord;
	}
}
