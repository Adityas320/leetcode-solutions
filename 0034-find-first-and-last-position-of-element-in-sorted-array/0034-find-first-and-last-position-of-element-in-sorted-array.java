class Solution {
public static int[] searchRange(int[] nums, int target) {
        int a =0,b=nums.length-1,first=-1,last=-1;
        while (b>=a) {
            int mid = (a+b)/2;
            if(target>nums[mid]) {
                a=mid+1;
            }
            else if(nums[mid]>target) {
                b=mid-1;
            }
            else{
                first=mid;
                b=mid-1;
            }
        }
        a =0;b=nums.length-1;
        while (b>=a) {
            int mid = (a+b)/2;
            if(target>nums[mid]) {
                a=mid+1;
            }
            else if(nums[mid]>target) {
                b=mid-1;
            }
            else{
                last=mid;
                a=mid+1;
            }
        }
        int [] arr = {first,last};
        return arr;
    }
}