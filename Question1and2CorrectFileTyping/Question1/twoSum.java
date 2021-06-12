package twoSum;

import java.util.HashMap;


public class twoSum {
	//Create a hashmap to store each integer of a pair 
	static HashMap<Integer, Integer> pair1 = new HashMap<>();
    static HashMap<Integer, Integer> pair2 = new HashMap<>();
	//Use a global variable to keep track of how many pairs there are so you know how many to print
    static int pairCount = 0;
    
    //Put array into a hashmap
    static public void twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i <nums.length; i++) {
            
            map.put(nums[i], i);
        }
        
        //Cycle through all integers, checking if there is an integer in the hash map which when sumed with the current integer, will be equal to the target sun
        for(int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];
            if(map.containsKey(complement) && nums[map.get(complement)] != nums[i]) { //The second condition excludes integers to be compared to themselves
                
               //Compare the integers to all other paired integers to ensure no repeats (ensure that each pair is unique
            	if (pair1.containsValue(nums[i]) == false && pair2.containsValue(nums[i]) == false) {
            		pair1.put(i, nums[i]);
                	pair2.put(i, nums[map.get(complement)]);
                	pairCount++;
            	}
            	
               
               
               
            }
        }
        
        for (int i = 0; i < pairCount-1; i++) {
			
			System.out.println("(" + pair1.get(i) + ", " + pair2.get(i) + ")");
			
        }
    }
	
	public static void main (String[] args ) {
		int[] nums = {1,2,5,6,3,4,5,6,4,1,9,4,1,2,4,23};
		int target = 7;
		twoSum(nums, target);
		
	}
    
}
