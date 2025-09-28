/* Given an array of integers nums and an integer target,
   retrun indices of the two numbers such that thay add up to target.
*/
//importing required modules 
import java.util.HashMap;
import java.util.Map;

public class Problem2 { // creating a class 

    public int[] twoSum(int[] nums, int target) { // creating the functions  
        Map<Integer, Integer> map = new HashMap<>();  // creating a map 
        for (int i = 0; i < nums.length; i++) { // loop through each elements
            int complement = target - nums[i]; // calculate the number needed to reach the target
            if (map.containsKey(complement)) { // if condition to return the values
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // creating the nums 
        int target = 9; // creating target
        int[] res = new Problem2().twoSum(nums, target); //calling the function 
        System.out.println("Indices: [" + res[0] + ", " + res[1] + "]"); // output printing
    }
}
