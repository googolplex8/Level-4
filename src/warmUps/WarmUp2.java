package warmUps;

public class WarmUp2 {
	public static void main(String[] args) {
		String word = "elephant";
		WarmUp2 runner = new WarmUp2();
		runner.alphabetize(word);
	}

	public String alphabetize(String input) {
		char[] word = input.toCharArray();
		boolean change = true;
		while (change) {
			change = false;
			for (int i = 0; i < word.length - 1; i++) {
				if (word[i] > word[i + 1]) {
					change = true;
					char temp = word[i];
					word[i] = word[i + 1];
					word[i + 1] = temp;
				}
			}
		}
		String output = new String(word);
		System.out.println(output);
		return output;
	}
}