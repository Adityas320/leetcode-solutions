class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0) {
            return -1;
        }
        int a=0,b=nums.length-1;
        while(b>=a) {
            int mid = (a+b)/2;
            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[mid]>target) {
                b=mid-1;
            }
            else {
                a=mid+1;
            }
         } 
            return a;
    }
}