import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int arr_in = 0;
		int seq_in = 0;
		while(arr_in < array.size() && seq_in < sequence.size()) {
			if(array.get(arr_in) == sequence.get(seq_in)) {
				seq_in += 1;
			}
			arr_in += 1;
		}
		return seq_in == sequence.size();
	}
}
