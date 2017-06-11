package hospital;

public class Patient {
boolean pulseChecked = false;
boolean isAlive = true;
public Patient(){
	
}
public void checkPulse(){
	pulseChecked=true;
}
public boolean feelsCaredFor(){
	return pulseChecked;
}
public void kill() {
	isAlive = false;
}
public boolean isAlive(){
	return isAlive;
}
}
