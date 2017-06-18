package hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	ArrayList<Zombie> zombies = new ArrayList<Zombie>();

	public Hospital() {

	}

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public void addZombie(Zombie z) {
		zombies.add(z);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public ArrayList<Zombie> getZombies() {
		return zombies;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int counter = 0;
		for (Doctor d : doctors) {
			for (int i = 0; i < 3; i++) {
				if (patients.size() - 1 >= counter) {
					d.assignPatient(patients.get(counter));
					counter++;
					// System.out.println("added a patient");
				}
			}
			// System.out.println("\nnew doctor");
		}
	}

	public void add(Object o) {
		if (o instanceof Doctor) {
			doctors.add((Doctor) o);
		} else if (o instanceof Patient) {
			patients.add((Patient) o);
		}

	}

	public void makeDoctorsWork() {
		// TODO Auto-generated method stub
		for (Doctor d : doctors) {
			d.doMedicine();
		}
	}
}