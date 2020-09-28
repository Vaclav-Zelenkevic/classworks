package lt.vtmc.vaclav;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class JavaStrings {

	public static void main(String[] args) {
		String str1 = "Katinas";
		String str2 = "Blogas";
		
		String str3 = str2 + " " + str1;
		System.out.println(str3);
		
		System.out.println(str1.concat(str2).concat(str3));
		
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(str2);
		sb.append(str3);
		System.out.println(sb);
		
		StringBuffer strbuff = new StringBuffer();
		strbuff.append(str1);
		strbuff.append(str2);
		strbuff.append(str3);
		System.out.println(strbuff);
		
		String names = "Tomas Tadas Akvile";
		String str6 = names.substring(6, 11);
		System.out.println(str6);
		
		StringTokenizer st = new StringTokenizer(strbuff.toString(), " ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println(Math.random());
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(100000));
		SecureRandom srnd = new SecureRandom();
		System.out.println(srnd);
		
		
		String[] colors = new String[3];
		colors[0] = "Red";
		colors[1] = "Green";
		colors[2] = "Blue";
//		colors[3] = "Orange";
		System.out.println(Arrays.toString(colors));
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
	}

}
