import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    	int[] squared = new int[array.length];
      for(int i = 0; i < array.length; i++) {
          squared[i] = array[i]*array[i];
      }
		Arrays.sort(squared);
      return squared;
  }
}
