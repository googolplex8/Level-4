import java.io.File;

public class FileEncryptor {

	public static File openSecretFile() {
		String directory = System.getProperty("user.dir");
		System.out.println(directory);
		File f = new File(directory + "/SecretFile.txt");
		System.out.println(f.isFile());
		return f;
	}

	public static String readOneLine(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String encrypt(String encryptMe) {
		char[] charInput = encryptMe.toCharArray();
		char[] charOutput = new char[charInput.length];
		for (int i = 0; i < charInput.length; i++) {
			if (charInput[i] < 'z') {
				charOutput[i] = ++charInput[i];
			} else {
				charOutput[i] = 'a';
			}
		}
		System.out.println(charOutput);
		return new String(charOutput);
	}

	public static String decrypt(String decryptMe) {
		char[] charInput = decryptMe.toCharArray();
		char[] charOutput = new char[charInput.length];
		for (int i = 0; i < charInput.length; i++) {
			if (charInput[i] > 'a') {
				charOutput[i] = --charInput[i];
			} else {
				charOutput[i] = 'z';
			}

		}
		System.out.println(charOutput);
		return new String(charOutput);
	}

}
