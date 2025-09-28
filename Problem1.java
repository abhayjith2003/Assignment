/*
 write a function that reverse a string. The input string is given as an array of characters s. 
*/

class  Problem1{ // creating a class 
	public void reverseString(char[] s){
 		//creating two variables
		int left = 0;
		int right = s.length - 1;
		//swap characters from both ends moving towards the center
		while (left < right){ // loop condition for moving to the center
 			//swapping
			char temp = s[left];  
			s[left] = s[right]; 
			s[right] = temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
        	char[] input = {'a', 'b', 'h', 'i', 'n', 'a', 'v'}; //creating the input varibale
        	Problem1 obj = new Problem1(); //creating a object 
        	obj.reverseString(input); // calling the function
	        System.out.println(new String(input)); // printing the output 
    }
}