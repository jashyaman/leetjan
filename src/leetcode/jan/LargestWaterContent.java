package leetcode.jan;

public class LargestWaterContent {
	
	/*
	 * "[...]. All pairs of the n lines define a rectangle with a height given by 
	 * the shorter line and a width given by the distance between the lines. 
	 * Return the area of the rectangle with the largest area."
	 */
	public static void main(String[] args) {
		
		int[] height = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {
    
		// why is the below solution wrong ?
//		int maxArea = 0;
//		for(int i=0;i<height.length;i++) {
//			for(int j = 0; j < height.length;j++) {
//				if(i == j) continue;
//				
//				int temp = height[i]*height[j];
//				
//				maxArea = maxArea >= temp ? maxArea : temp;
//				
//				
//				
//			}
//		}
		int maxArea = 0;
		int leftMost = 0, rightMost = height.length-1;
		
		while(leftMost < rightMost) {
			int temp = 
			  (rightMost - leftMost) * Math.min(height[leftMost], height[rightMost]);
			
			maxArea = maxArea >= temp ? maxArea : temp;
			
			if(height[leftMost] > height[rightMost]) {
				rightMost--;
			} else {
				leftMost++;
			}
			
		}
		
		return maxArea;
        
        
    }
	
	
	

}
