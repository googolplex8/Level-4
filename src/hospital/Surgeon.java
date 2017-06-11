package hospital;

public class Surgeon extends Doctor{
boolean performsSurgery = true;
public Surgeon(){
	
}
public boolean performsSurgery(){
	return performsSurgery;
}
public boolean makesHouseCalls(){
	return false;
}
}
