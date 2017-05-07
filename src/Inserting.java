
public class Inserting {

	public static int[] insertAt(int[] testArray, int index, int value) {
		testArray[index] = value;
		return testArray;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		int index = 0;
		String[] newArray = new String[orderedArray.length+1];
		for (int i = 0; i < orderedArray.length; i++) {
			if(string.compareTo(orderedArray[i])>0){
				newArray[i] = orderedArray[i];
			}
			else if(i<orderedArray.length-1 && string.compareTo(orderedArray[i])<0 && string.compareTo(orderedArray[i+1])>0){
				index = i;
				newArray[i] = string;
				break;
			}
			else if(i == orderedArray.length-1){
				newArray[i] = string;
				index = i;
				break;
			}
		}
		for (int i = index+1; i < newArray.length; i++) {
			newArray[i] = orderedArray[i-1];
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		return newArray;
	}

}
