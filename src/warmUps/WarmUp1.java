package warmUps;

public class WarmUp1 {
	public static void main(String[] args) {
		int[] nums  = {2, 4, 8, 6, 10, 12, 14, 3, 7, 5};
		WarmUp1 runner = new WarmUp1();
		runner.findAscendingLenght(nums);
	}
	public int findAscendingLenght(int[] input) {
		int maxLen = 0;
		int tempLen = 1;
		for (int i = 0; i < input.length-1; i++) {
			if (input[i + 1] > input[i]) {
				tempLen++;
			} else {
				if (tempLen > maxLen) {
					maxLen = tempLen;
				}
				tempLen = 1;
			}
		}
		System.out.println(maxLen);
		return maxLen;
	}
}
