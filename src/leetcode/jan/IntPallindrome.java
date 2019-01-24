package leetcode.jan;

public class IntPallindrome {
	
	
	public boolean isPalindrome(int x) {
		 if(x < 0) return false;
	        
	        if ( x == 0 ) return true;
	        
	        int len = String.valueOf(x).length();
	        
	        if (len == 1) return true;
	        
			int m = (int) Math.pow(10.0, (len-1));
			
			int p = 0;
			int t = x;
			while(t > 0) {
				int r = t % 10;
				t = t / 10;
				
				p+= (m*r);
				m/=10;
				
			}
	        
	        return (p - x) == 0;
	        
    }

}
