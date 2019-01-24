package leetcode.jan;

public class IntToRoman {
	
	


	public static void main(String[] args) {
		for(int i=2;i<8;i++) {
			
			System.out.println(i+" "+intToRoman(i));
		}
		
	}

	public static String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
		
        int len = String.valueOf(num).length();
        
        int u  = num % 10;
        int t = (num / 10 ) % 10;
        int h = (num / 100) % 10;
        int th = (num / 1000) % 10;
        
        
        
       
        
        ans.append(process("th",th));
        ans.append(process("h",h));
        ans.append(process("t",t));
        ans.append(process("u",u));
		
		return ans.toString();
    }

	

	private static String times(String s, int u) {
		if(u==0) return "";
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i< u;i++) {
			sb.append(s);
		}
		return sb.toString();
		
	}
	
	
	private static String process(String type, int u) {
		StringBuilder ans = new StringBuilder();
		String FIVE = "",ONE = "", TENS = "";
		
		switch (type) {
			case "u": 
				FIVE = "V";
				ONE = "I";
				TENS = "X";
			break;
			case "t": 
				FIVE = "L";
				ONE = "X";
				TENS = "C";
			break;
			case "h": 
				FIVE = "D";
				ONE = "C";
				TENS = "M";
			break;
			case "th": 
				FIVE = "";
				ONE = "M";
				TENS = "";
			break;
			
		}
		
		
		if (u >= 5) {
		    		if(u == 9) {
		    			ans.append(times(ONE,(u-8))+ TENS);
		    		}
		    		else {
		    			ans.append(FIVE+times(ONE,(u-5)));
		    		}
		    } else {
		    		if(u == 4) {
		    			ans.append(times(ONE, (u-3))+FIVE);
		    		}else {
		    			ans.append(times(ONE, u));
		    		}
		    }
		return ans.toString();
	}
	
	
}
