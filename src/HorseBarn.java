
public class HorseBarn {
	private Horse[] spaces;

	public HorseBarn(Horse[] spaces) {
		this.spaces = spaces;
	}
	public static HorseBarn createTestBarn(){
		Horse trigger = new Horse("Trigger", 1340);
		Horse silver = new Horse("Silver", 1210);
		Horse lady = new Horse("Lady", 1575);
		Horse patches = new Horse("Patches", 1350);
		Horse duke = new Horse("Duke", 1410);
		
		Horse[] horses = new Horse[7];
		horses[0] = trigger;
		horses[1] = null;
		horses[2] = silver;
		horses[3] = lady;
		horses[4] = null;
		horses[5] = patches;
		horses[6] = duke;
		HorseBarn horseBarn = new HorseBarn(horses);
		return horseBarn;
	}
	public Horse[] getSpaces() {
		return spaces;
	}

	public int findHorseSpace(String name) {
		for (int i = 0; i < spaces.length; i++) {
			if(spaces[i]== null){
				
			}
			else if (spaces[i].getName() == name) {
				return i;
			}
		}
		return -1;
	}
	public void consolidate(){
		boolean change= true;
		while(change){
			change = false;
			for (int i = 1; i < spaces.length; i++) {
				if(spaces[i-1]==null && spaces[i]!=null){
					change=true;
					spaces[i-1] = spaces[i];
					spaces[i]=  null;
				}
			}
		}
//		for (int i = 0; i < spaces.length; i++) {
//			System.out.println(spaces[i].getName());
//		}
		
	}
}
