public class Horse {
	private String name;
	private int weight;

	public Horse(String name, int weight) {
		this.setName(name);
		this.setWeight(weight);
	}

	int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}
