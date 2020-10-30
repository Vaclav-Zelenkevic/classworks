package lt.vtmc.compare;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		if (str1.length() > str2.length()) {
			return 1;
		} else if (str1.length() < str2.length()) {
			return -1;
		}
		return 0;
	}

}
