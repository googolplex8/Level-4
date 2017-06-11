package hospital;

import java.util.ArrayList;

import org.junit.experimental.theories.Theories;

public class Doctor extends DoctorFullException {
	boolean performsSurgery = false;
	boolean isEvil = false;
	Hospital hospital;
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public Doctor() {

	}

	public Doctor(String string) {
		if(string.equals("666")){
			isEvil=true;
		}
	}

	public Doctor(String string, Hospital h) {
		h.addDoctor(this);
		this.hospital=h;
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
			for (Patient p : patients) {
				p.kill();
			}
		} else {
			for (Patient p : patients) {
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
