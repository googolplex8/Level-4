package hospital;

public class Zombie extends Patient {
	String timeOfDeath;

	Zombie(String timeOfDeath) {
		this.timeOfDeath = timeOfDeath;
	}

	Zombie(Patient p, String timeOfDeath) {
		this(timeOfDeath);
		this.isAlive = false;
	}

	public String getTimeOfDeath() {
		return timeOfDeath;
	}
}
