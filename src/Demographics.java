import java.util.Random;

public class Demographics {
	Person[] peopleList;

	public static void main(String[] args) {
		Demographics d = new Demographics();
		d.init();
		while (d.getAverageAge() > 11) {
			d.ratio();
			System.out.println("The average age was: " + d.getAverageAge());
			d.generationGap();
			System.out.println("Now the average age is: " + d.getAverageAge());
			d.ratio();
			System.out.println();
		}
	}

	void init() {
		peopleList = new Person[50];
		for (int i = 0; i < 25; i++) {
			peopleList[i] = new Person();
		}
		for (int i = 25; i < 50; i++) {
			peopleList[i] = new Dogman();
		}
	}

	double getAverageAge() {
		double sum = 0.0;
		for (int i = 0; i < peopleList.length; i++) {
			sum += peopleList[i].getAge();
		}
		return sum / peopleList.length;
	}

	int getOldest() {
		int max = 0;
		int index = 0;
		for (int i = 0; i < peopleList.length; i++) {
			if (peopleList[i].getAge() > max) {
				max = peopleList[i].getAge();
				index = i;
			}
		}
		return index;
	}

	void generationGap() {
		Random r = new Random();
		for (int i = 0; i < peopleList.length; i++) {
			peopleList[i].age();
		}
		for (int i = 0; i < 5; i++) {
			if (r.nextInt(100) < 50) {
				peopleList[getOldest()] = new Person();

			}
			peopleList[getOldest()] = new Dogman();

		}
	}
	void ratio(){
		int numDogs = 0;
		int numPeople = 0;
		for (int i = 0; i < peopleList.length; i++) {
			if(peopleList[i] instanceof Dogman){
				numDogs++;
			}
			else{
				numPeople++;
			}
		}
		System.out.println("The person to dogman ratio is " + (float)numPeople/numDogs);
	}

}
