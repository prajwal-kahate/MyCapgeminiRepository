package com.demoRegex;
import java.util.regex.*;

public class DemoRegex {

	public static void main(String[] args) {
		int count = 0;
		
//		Pattern p = Pattern.compile("abc");
//		Matcher m = p.matcher("aabcbbbabcab");
//		
//		while(m.find()) {
//			count++;
//			System.out.println(m.start()+" "+m.group()+" "+m.end());
//		}
//	
//		System.out.println("Ans: "+count);
//		System.out.println(Pattern.matches("[^0-9]{5}","acv10" ));
		
		System.out.println(Pattern.matches("[0-9_$]+[.]", "099_$%."));
	}

}
