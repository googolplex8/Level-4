public class Barf {
public static void main(String[] args) {
	String a = "IKTFBEh_CY1=v?hctaw/moc.ebutuoy";
	reverseMe(a);
}

public static String reverseMe(String input){
	String output = "";
	for(int i = input.length(); i>0; i--){
		output = output + input.substring(i-1, i);
	}
	System.out.println(output);
	return output;
}
}
