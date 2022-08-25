
public class TargetArray {
	public static void main(String arg[]) {
		TargetArray targetArray=new TargetArray();
		int []nums= { 3,2,4};
		int [] response= targetArray.twoSum(nums, 6);
		System.out.println( response[0]+","+ response[1]);
	}
	
	   public int[] twoSum(int[] nums, int target) {
	        int []response= {0,0};
	        for(int ind1=0;ind1<nums.length-1;ind1++ ) {
	        	int data=nums[ind1];
	        	for(int ind2=ind1+1;ind2<nums.length;ind2++) {
	        		int data2=nums[ind2];
	        		if((data+data2)==target) {
	        			response[0]=ind1;
	        			response[1]=ind2;
	        		}
	        	}
	        	
	        }
	        return response; 
	    }

}
