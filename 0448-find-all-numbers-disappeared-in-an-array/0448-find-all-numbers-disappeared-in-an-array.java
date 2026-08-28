import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for (int index = 0; index < n ; index++) {
            int val = Math.abs(nums[index]);
            int pos = val - 1 ;

            if (nums[pos] > 0) {
                nums[pos] = -nums[pos];                
            }
        }

        for (int i = 0 ; i < n; i++) {
            if (nums[i] > 0) {
                int some = i + 1;
                ans.add(some);
            }
        }
        return ans ;
    }

}