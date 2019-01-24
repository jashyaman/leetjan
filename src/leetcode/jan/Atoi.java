package leetcode.jan;

import java.util.ArrayList;
import java.util.List;

public class Atoi {
	
	public static void main(String[] args) {
		String s = "3.423";
		double l = Double.parseDouble(s);
		System.out.println(l+"");
		
		int e = Integer.parseInt(Math.round(l)+"");
		System.out.println(e);
		
	}
	
//	public static void main(String[] args) {
//		List<String> strlist = new ArrayList<>();
////		strlist.add("23 guns");
////		strlist.add("wasted");
////		strlist.add("     23watts");
////		strlist.add("     wasp");
////		strlist.add("-23 guns");
////		strlist.add("-3243v3 guns");
//		//strlist.add("-3243v3 guns");
//	//	strlist.add("2147483648");
//		//strlist.add("words and 987");
//		//strlist.add("+1");
//		strlist.add("   -42");
//		for(String str : strlist) {
//			System.out.println(">"+str + "<");
//			System.out.println(new Atoi().myAtoi(str));
//		}
//		
////		try {
////			Integer.parseInt("2147483649");
////		} catch(NumberFormatException e) {
////			System.out.println();
////		}
////		
//		
//	}
//	
	 public int myAtoi(String str) {
		 StringBuilder sb = new StringBuilder();
		 str = str.trim(); // remove leading spaces
		 
		 if(Character.isLetter(str.charAt(0))) { // remove first character is non numeric
			 return 0;
		 }
		 int i = 0;
		 
		 
		 if(str.charAt(0) == '+' || str.charAt(0) == '-') {
			 i++;
			 if(str.charAt(0) == '-') {
				 sb.append(str.charAt(0));
			 }
			 
		 }
		 
		 for(;i<str.length();i++) {
			 char c = str.charAt(i);
			 if(c == '+' || c == '-') {
				 return 0;
			 }
			 
			 if(Character.isDigit(c)) {
				 sb.append(c);
			 } else {
				 break;
			 }
		 }
		 
		 try {
	            Integer.parseInt(str);
	        } catch(NumberFormatException e) {
	            if(e.getMessage().indexOf('-') == -1 ) {
	                // if true, then +ve, else -ve num
	                return Integer.MAX_VALUE;
	            } else {
	                return Integer.MIN_VALUE;
	            }
	            
	        }
	        
	        int inr = Integer.parseInt(str);
	        
	        return inr;
	    }
	
	 public int myAtoi2(String str) {
	        System.out.println(str);
	        
	        // sanity checks
	        str = str.trim();  // removes leading whitespaces
	        boolean signCharAlreadyFound = false;
	        boolean ignoreLeadingZeros = true;
	        
	        StringBuilder sb = new StringBuilder();
	        
	        boolean sanitycheckPassed = true;
	        for(int i =0;i<str.length();i++) {
	            char c = str.charAt(i);
	           
	            
	            if((c == '0') && ignoreLeadingZeros) {  
	                // removes leading zeros
	                // until ignoreLeadingZeros is set to FALSE once a non zero 
	                //Integer is observed.
	                continue;
	            }
	            
	            if(c == '-' || c == '+') { 
	                if(signCharAlreadyFound) { // checks invalid str
	                    return 0;
	                }
	                
	                if(c == '-') {
		                 sb.append(c);
		            }
	                signCharAlreadyFound = true;
	            } 
	            // sanity checks

	            //extract number with sign
	            if(Character.isDigit(c)) {
	                
	                ignoreLeadingZeros = false;
	                sb.append(c);
	            } else if (c == '+' || c == '-'){
	            		continue;
	            } else {
	                break;
	            }
	            
	        }
	      
	        str = sb.toString();
	        
	        
//	         if(
//	             sb.length() == 0 
//	             ||
//	            ( sb.length() == 1 && 
//	             (
//	                 sb.toString().equals("-") || sb.toString().equals("+")
//	             ) 
//	            )
//	           ){
//	             return 0;
//	         }
	      
	       
	        try {
	        	System.out.println("we are trying to parse this :");
	        	System.out.println(str);
	            Integer.parseInt(str);
	        } catch(NumberFormatException e) {
	            if(e.getMessage().indexOf('-') == -1 ) {
	                // if true, then +ve, else -ve num
	                return Integer.MAX_VALUE;
	            } else {
	                return Integer.MIN_VALUE;
	            }
	            
	        }
	        
	        int inr = Integer.parseInt(str);
	        
	        
	        
	        return inr;
	        
	    }

}
