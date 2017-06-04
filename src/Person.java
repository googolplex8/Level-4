import java.util.Random;

public class Person {
	public int age;
	public String name;
	String[] states = { "California,", "Alabama,", "Arkansas,", "Arizona,", "Alaska,", "Colorado,", "Connecticut,",
			"Delaware,", "Florida,", "Georgia,", "Hawaii,", "Idaho,", "Illinois,", "Indiana,", "Iowa,", "Kansas,",
			"Kentucky,", "Louisiana,", "Maine,", "Maryland,", "Massachusetts,", "Michigan,", "Minnesota,",
			"Mississippi,", "Missouri,", "Montana,", "Nebraska,", "Nevada,", "New Hampshire,", "New Jersey,",
			"New Mexico,", "New York,", "North Carolina,", "North Dakota,", "Ohio,", "Oklahoma,", "Oregon,",
			"Pennsylvania,", "Rhode Island,", "South Carolina,", "South Dakota,", "Tennessee,", "Texas,", "Utah,",
			"Vermont,", "Virginia,", "Washington,", "West Virginia,", "Wisconsin,", "Wyoming" };

	Person() {
		Random rand = new Random();
		name = states[rand.nextInt(50)];
		age = rand.nextInt(100);
	}
	void age(){
		age = age+1;
	}
	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}
