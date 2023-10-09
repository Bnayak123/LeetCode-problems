package leetcodeProblames;

import java.util.Arrays;

public class Snippet {
	 public static double findMaxAverage(int[] nums, int k) {
	        int windowOpening = 0;
	        int sum = 0;
	        int max = Integer.MIN_VALUE;
	        for(int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            if(i >= k - 1) {
	                max = Math.max(max, sum);
	                sum -= nums[windowOpening++];
	            }
	        }
	        return (double)max/k;
}
	 public static void main(String[] args) {
		//int[] num= {1,2,3,4,5,6,7};
		//findMaxAverage(num,4);
		//rotate(num,3);
		
		//System.out.println(Arrays.toString(num));
		
		int[] nums= {1,2};
		System.out.println(jump(nums));
		
		
	}
	 public static void rotate(int[] nums, int k) {
		 k%=nums.length;
	        reverse(nums,0,nums.length-1);
	        reverse(nums,0,k-1);
	        reverse(nums,k,nums.length-1);
	 }
	public static void  reverse(int[]nums, int start,int end){
	        while(start<end){
	            int temp=nums[start];
	            nums[start]=nums[end];
	            nums[end]=temp;
	            start++;
	            end--;
	        }
	    }
	
	public static int jump(int[] nums) {
		 if(nums.length==1){
	           return 0;
	       }
	    int ans=1;
	    int end=0;
	    int max=0;
	    for(int i=0; i<nums.length;i++){
	        max=Math.max(max,i+nums[i]);
	        if(max>=nums.length-1){
	            return ans++;
	        }
	        if(i==end){
	            ans++;
	            end=max;
	        }

	    }
	      return ans;
	}
	 public int mostWordsFound(String[] sentences) {
	        int ans=0;
	        for(String str: sentences){
	          int total=  sentenceSeparated(str);
	          ans=Math.max(ans,total);
	        }
	    return ans;
	    }
	    public static int  sentenceSeparated(String sentences){
	        String[] str= sentences.split(" ");
	        return str.length;
	    }
	
	
	 
}


