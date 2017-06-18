package hospital;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
	boolean performsSurgery = false;
	boolean isEvil = false;
	Hospital hospital;
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public Doctor() {

	}

	public Doctor(String string) {
		if (string.equals("666")) {
			isEvil = true;
		}
	}

	public Doctor(String string, Hospital h) {
		this(string);
		h.addDoctor(this);
		this.hospital = h;

	}

	public void assignPatient(Patient p) throws DoctorFullException {
		if (patients.size() >= 3) {
			throw new DoctorFullException("Doctor has too many patients");
		} else {
			patients.add(p);
		}
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void doMedicine() {
		if (isEvil == true) {
			System.out.println("an evil doctor");
			for (Patient p : patients) {
				p.kill();
				System.out.println("killed");
				Zombie z = new Zombie(p, new Date().toString());
				hospital.addZombie(z);
				System.out.println("There are " + hospital.getZombies().size() + " zombies");
				int index = hospital.patients.indexOf(p);
				hospital.patients.remove(index);
			}
			System.out.println("There are " + patients.size() + " patients");
			patients.removeAll(patients);
			System.out.println("There are " + patients.size() + " patients");

		} else {
			System.out.println("a good doctor");
			for (Patient p : patients) {
				System.out.println("checked");
				p.checkPulse();
			}
		}
	}

	public boolean performsSurgery() {
		return performsSurgery;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public Object isEvil() {
		return isEvil;
	}

	public void joinTheDarkSide() {
		isEvil = true;
	}

	public Object getHospital() {
		return this.hospital;
	}
}
