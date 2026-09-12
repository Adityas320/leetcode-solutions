import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bool = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                bool.add(true);
            }
            else {
                bool.add(false);
            }
        }

        return bool;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 3};
        int extra = 4;

        List<Boolean> boo = new ArrayList<>();

        boo = new Solution().kidsWithCandies(arr, extra);

        System.out.println(boo);
    }
}