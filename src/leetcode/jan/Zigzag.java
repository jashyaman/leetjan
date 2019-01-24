package leetcode.jan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/zigzag-conversion/
public class Zigzag {
	
	public static void main(String[] args) {
		
		String s = "1234567";
		int numRows = 3;
		System.out.println(new Zigzag().new Solution().convert(s, numRows));
	}
	
	class Solution {
		
		
		/*
		 * identify the number of rows
		 * 
		 * iterate through string.charAt(i) until all rows of first column are populated
		 * then iterate column, decrement row count by 1. 
		 * print string.charAt(next i)
		 * if(row == 0) 
		 * 
		 * iterate through string.charAt(i) until all rows of column are populated
		 * then iterate column, decrement row count by 1.
		 * print string.charAt(next i)
		 * if(row == 0)
		 * 
		 * iterate through string.charAt(i) until all rows of column are populated
		 * then iterate column, decrement row count by 1.
		 * print string.charAt(next i)
		 * if(row == 0)
		 */
		
	    public String convert(String s, int numRows) {
	        String ans = "";
	        Map<Integer, List<String>> map = new HashMap<>();
	        
	        String[] arr = s.split("");
	        
	        int rowpos = 0;
	        int colpos = 0;
	        int incr = 1;
	        
	        boolean downflag = true;
	        
	        for(int i=0; i<arr.length ; i++) {
	        		String elem = arr[i];
	        		if(rowpos >= numRows) {
	        			downflag = false;
	        			incr = -1;
	        		}
	        		List<String> value = new ArrayList<>();
	        		if(downflag) {
	        			if(map.get(rowpos) == null) {
	        				map.put(rowpos, new ArrayList<>());
	        			}
	        			value =  map.get(rowpos);
	        			value.add(colpos,elem);
	        			map.put(rowpos, value);
	        			rowpos+=incr;
	        		} else {
	        			rowpos+=incr;
	        			colpos++;
	        			value =  map.get(rowpos);
	        			value.add(colpos, elem);
	        			map.put(rowpos, value);
	        			downflag = true;
	        		}
	        }
	        
	        map = cleanupMap(map);
	        
	        ans = printMap(map);
	        return ans;
	    }

		private String printMap(Map<Integer, List<String>> map) {
			StringBuilder sb = new StringBuilder();
			Set<Integer>  keys = map.keySet();
			
			for(Integer k : keys) {
				List<String> list = map.get(k);
				
				for(int i = 0; i < list.size() ; i++) {
					if(list.get(i).equals("")) {
						
					} else {
						sb.append(list.get(i));
					}
				}
			}
			return sb.toString();
		}

		private Map<Integer, List<String>> cleanupMap(Map<Integer, List<String>> map) {
			Set<Integer>  keys = map.keySet();
			
			for(Integer k : keys) {
				List<String> list = map.get(k);
				
				for(int i = 0; i < list.size() ; i++) {
					if(list.get(i) == null) {
						list.set(i, "");
					}
				}
				map.put(k, list);
				
			}
			
			
			return map;
		}
	}

}
