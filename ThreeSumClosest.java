package apas;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
	   public int threeSumClosest(int[] nums, int target) {
	    int diff = Integer.MAX_VALUE, sz = nums.length;
	    Arrays.sort(nums);
	    for (int i = 0; i < sz && diff != 0; ++i) {
	        int lo = i + 1, hi = sz - 1;
	        while (lo < hi) {
	            int sum = nums[i] + nums[lo] + nums[hi];
	            if (Math.abs(target - sum) < Math.abs(diff))
	                diff = target - sum;
	            if (sum < target)
	                ++lo;
	            else
	                --hi;
	        }
	    }
	    return target - diff;
	}
	}
	class ThreeSumClosest{
	    public static void main(String[] args){
	        Scanner s =new Scanner(System.in);
	        int tar,n;
	        n = s.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++){
	            a[i]=s.nextInt();
	        }
	        tar = s.nextInt();
	        Solution p = new Solution();
	        int res = p.threeSumClosest(a,tar);
	        System.out.println(res);
	    }
	}