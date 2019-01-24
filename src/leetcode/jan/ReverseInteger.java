package leetcode.jan;

import java.util.Random;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int orig = 
				1534236469;
		new Random().nextInt(1000);
		System.out.println("original " +orig);
		System.out.println(new ReverseInteger().reverse(orig));
		
		int x = 2000000000;
		int y = 1000000000;
		int z = 1534236469;
		
		try {
		    int result = Math.addExact(x, y);
		    System.out.println("The proper result is " + result);
		} catch(ArithmeticException e) {
		    System.out.println("Sorry, " + e);
		}
		
	}
	
	
	
	
	 public int reverse(int x) {
		 if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
			 return 0;
		 }
		 boolean neg = x < 0 ;
		 int len = String.valueOf(Math.abs(x)).length();
		 int multiplier =  (neg ? - 1 : 1);
		 int ans = 0, b = 0;
		 
		 while(--len != 0) {
			 multiplier*=10 ;
		 }
		 int a = Math.abs(x);
		 do{
			 b = a % 10;
			 a = a / 10;
			
			 try {
				 ans = Math.addExact(ans, (b * multiplier));
			 } catch(ArithmeticException e) {
				 return 0;
			 }
			 
			 multiplier/=10;
		 }while(a != 0) ;
		 
		 
		 /*
		 a = 321
		 
		 a = a / 10; -- 32
		 b = a % 10;  -- 1
		 
		 ans = ans +  b * 100;
		 ans = 100;
		 
		 a = a / 10; -- 3
		 b = a % 10; -- 2
		 ans = ans + b * 10;
		 ans = 120;
		 
		 a = a / 10 -- 0
		 b = a % 10 -- 3
		 
		 ans = ans + b * 1;
		 ans = 123
		 
		 
		 */
		 
		 
		 return ans;
	 }
}
