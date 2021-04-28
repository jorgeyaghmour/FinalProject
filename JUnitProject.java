package JUnitTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class JUnitProject {

	public void countAllWords(String fileName, Map<String, Integer> text) throws FileNotFoundException {
		Scanner file = new Scanner(new File(fileName)); // reads from the file
		while (file.hasNext()) { // iterator loop 
			String line = file.next(); // starts at first word until the last word 
			Integer count = text.get(line); // store number of appeared words
			if (count != null) { 
				count++; 
			} else
				count = 1;
			text.put(line, count); // counts word and repetition
		}
		file.close();
	}

	public static List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap) {

		Set<Entry<String, Integer>> set = wordMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		return list;
	}
}