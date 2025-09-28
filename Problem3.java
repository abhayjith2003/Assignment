/* Given ab integer x , return true if x is a palindrome and  false otherwise */

public class Problem3 { 

    public boolean isPalindrome(int x) {
            if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10; 
            x = x / 10;
        }

            return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        Problem3 obj = new Problem3();
        System.out.println(obj.isPalindrome(121));  
        System.out.println(obj.isPalindrome(232)); 
        System.out.println(obj.isPalindrome(123));   
    }
}
