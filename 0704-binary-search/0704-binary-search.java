class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0) {
            return -1;
        }
        int a=0;
        int b=nums.length-1;
        while (b>=a) {
            int mid = (a+b)/2;
            if(nums[mid]== target) {
                return mid;
            }else if(target>nums[mid]) { 
                a=mid+1;
            }else {
                
                b=mid-1;
            }
            
        }
        return -1;
    }
}