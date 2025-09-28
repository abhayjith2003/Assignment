/*
 Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place 
 such that each unique element appears at most twice. The relative order of the elements 
 should be kept the same.
*/ 

public class Problem7{

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int k = 2; 
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k; 
    }
    public static void main(String[] args) {
        Problem7 obj = new Problem7();

        int[] nums = {0,0,1,1,1,1,2,3,3,4,4,4};
        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k); 
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " "); 
        }
        
    }
}
