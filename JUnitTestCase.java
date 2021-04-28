package JUnitTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestCase {

	@Test
	public void test() {

		JUnitProject sort = new JUnitProject();
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		List<Entry<String, Integer>> list = sort.sortByValue(wordMap);
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
	}

}
