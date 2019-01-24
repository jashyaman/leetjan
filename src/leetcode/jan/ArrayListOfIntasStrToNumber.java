package leetcode.jan;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfIntasStrToNumber {
	
	
	public static void main(String[] args) {
		
		
		List<String> ls = new ArrayList<>();
		ls.add("2");
		ls.add("3");
		ls.add("5");
		ls.add("9");
		ls.add("1");
		
		
		int tot = ls.size();
		
		int multiplier = 1;
		
		while(--tot > 0) {
			multiplier*=10;
		}
		
		int ans = 0;
		
		for(String s : ls) {
			
			int i = Integer.valueOf(s);
			
			int placevalue = i * multiplier;
			multiplier/=10;
			ans+=placevalue;
		}
		System.out.println(ans);
	}

}
