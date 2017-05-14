
public class GitHubLove {
	public static void main(String[] args) {
		String[] usernames = {  "googolplex8" ,"jzhao156", "yuz217", "Ianleeeee", "AndrewPark78" };
		while(traverse(usernames)==false){
			traverse(usernames);
		}
		for (int i = 0; i < usernames.length; i++) {
			System.out.println(usernames[i]);
		}
	}
	public static boolean traverse(String[] usernames){
		boolean output = true;
		for (int i = 0; i < usernames.length - 1; i++) {
			if (usernames[i].compareTo(usernames[i + 1]) > 0) {
				String temp = usernames[i];
				usernames[i] = usernames[i + 1];
				usernames[i + 1] = temp;
				output = false;
			}
		}
		return output;
	}
}
