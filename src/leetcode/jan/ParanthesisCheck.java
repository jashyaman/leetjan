package leetcode.jan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParanthesisCheck {
	
	static Map<Character,Character> map = new HashMap<Character,Character>() {
		{
			put('}','{');
			put(')','(');
			put(']','[');
			
		}
	};
	
	public static boolean isValid(String s) {
		Stack<Character> stk = new Stack<Character>();
		
		char c;
		for(int i =0;i<s.length();i++) {
			c = s.charAt(i);
			if(c == '{' || c == '{' || c == '[') {
				stk.push(c);
			} else {
				if(map.get(c) == stk.peek()) {
					stk.pop();
				} else {
					stk.push(c);
				}
			}
		}
		
		
		return stk.empty();
	}
	
	



	public static void main(String[] args) {

		String s[] = { "{[]}","{}" };

//		Arrays.asList(s).parallelStream().forEach(str -> {
//			System.out.println(str + " " + isValid(str));
//		});
		Arrays.asList(s).stream().forEach(str -> exec(str));
	}
	
	static void exec(String str){
		System.out.println(str + " " + isValid(str));
	}
}
