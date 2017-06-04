import java.util.Random;

public class Dogman extends Person{
	public Dogman(){
		Random rand = new Random();
		name = "Andrew";
		age = rand.nextInt(20)+1;
	}
	void age(){
		age = age+1;
	}
}
