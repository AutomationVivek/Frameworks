package week4day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_creditcard {

	public static void main(String[] args) {
		//String txt="1234-5647-8912-3456";
		//String pattern="\\d{4}-\\d{4}-\\d{4}-\\d{4}";
		String email="aarthis.srini@gmail.com";
		String pattern="[a-z0-9\\W]{23}";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(email);
		System.out.println(m.matches());

	}

}
