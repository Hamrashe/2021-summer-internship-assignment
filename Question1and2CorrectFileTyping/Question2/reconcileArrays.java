package reconcileArrays;


import java.util.HashMap;

public class reconcileArrays {
	static void reconcileHelper(int[] a, int[] b) {
		
		//Store array a in an indexed hashmap
		HashMap<Integer, Integer> aCopy = new HashMap<>();
		for (int i = 0; i < a.length ; i++) {
			aCopy.put(i, a[i]);
		}
		
		//Store array b in an indexed hashmap
		HashMap<Integer, Integer> bCopy = new HashMap<>();
		for (int i = 0; i < b.length ; i++) {
			bCopy.put(i, b[i]);
		}
		
		//Compare array a with the values in the hashmap of b and print the results, "Numbers in array a that aren't in array b:"
		System.out.println("Numbers in array a that aren't in array b: ");
		System.out.println();
		for(int i = 0; i < a.length; i++) {
			if(bCopy.containsValue(a[i]) == false) {
				
				System.out.print(a[i] + " ");
				
				
			}
		}
		System.out.println();
		
		//Compare array b with the values in the hashmap of a and print the results, "Numbers in array b that aren't in array a:"
		System.out.println("Numbers in array b that aren't in array a: ");
		System.out.println();
		for(int i = 0; i < b.length; i++) {
			if(aCopy.containsValue(b[i]) == false) {
				
				System.out.print(b[i] + " ");
				
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {3,4,5,6,7};
		
		reconcileHelper(a, b);
		
	}
	
}
