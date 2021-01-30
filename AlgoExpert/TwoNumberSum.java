import java.util.*;

// O(n) time | O(n) space 

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
		ArrayList<Integer> set = new ArrayList<>();
		for(int i = 0; i < array.length; i++) {
			
			int incumbent = targetSum - array[i];
			if(set.contains(incumbent)) {
				return new int[] {incumbent, array[i]};
			} else {
					set.add(array[i]);
				}
			
		}
		return new int[0];
  }
}
