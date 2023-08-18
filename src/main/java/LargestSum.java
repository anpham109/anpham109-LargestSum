
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int biggestInt = nums.get(0);
        int secondBiggestInt = nums.get(0);
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > biggestInt){
                secondBiggestInt = biggestInt;
                biggestInt = nums.get(i);
            }
        }
        return biggestInt + secondBiggestInt;
    }
}