package improtantProgram;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCount {

	public static void main(String[] args) {

		int nums[] = { 1, 1, 2, 3, 4, 5, 3, 6, 3, 7, 4, 8, 9 };

		Map<Integer, Integer> numCount = new HashMap<>();
		// Count occurrences of each number
		for (int n : nums) {
			if (numCount.containsKey(n)) {
				numCount.put(n, numCount.get(n) + 1);
			} else {
				numCount.put(n, 1);
			}
		}
		// Display the counts
		for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
			System.out.println("Number " + entry.getKey() + " occurs " + entry.getValue() + " times");
		}

		System.out.println("one more time");
		int[] numbers = { 2, 3, 4, 2, 5, 6, 3, 4, 7, 8, 5, 9, 9 };

		for (int i = 0; i < numbers.length; i++) {
			int count = 1;
			if (numbers[i] != -1) {
				for (int j = i + 1; j < numbers.length; j++) {
					if (numbers[i] == numbers[j]) {
						count++;
						numbers[j] = -1; // Mark the repeated number as -1 to avoid recounting it
					}
				}
				System.out.println("Number " + numbers[i] + " occurs " + count + " times");
			}
		}

	}

}
