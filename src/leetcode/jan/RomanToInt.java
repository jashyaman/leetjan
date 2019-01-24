package leetcode.jan;

import java.util.HashMap;

public class RomanToInt {
	
	
	static int ans = 0;	
	public static int romanToInt(String s) {
		int ans = 0;
		char c;
		int num = 0;
		int numiter = 0;
		
		for(int i = s.length()-1;i >=0;i--) {
			
			c = s.charAt(i);
			
			if(map.get(c) >= num) {
				ans+=map.get(c);
			} else {
				ans-=map.get(c);
			} 
			num = map.get(c);
		}
		return ans;
	
    }


	
	
	static HashMap<Character, Integer> map = new HashMap<Character,Integer>() {
		{
			put('I',1);
			put('V',5);
			put('X',10);
			put('L',50);
			put('C',100);
			put('D',500);
			put('M',1000);
		}
	};
		
	public static void main(String[] args) {
		String sa[] = { "XLII","LXXVII","XII","CVIII","CX","VII","VIII","IX","XI","XIII","XX","C"};
			//{ "CVIII","XII","LXXVII","XLII","LVIII","MCMXCIV" };
		
		for(String s : sa) {
			System.out.print(s);
			System.out.println(" " + romanToInt(s));
		}
				
	}
}
