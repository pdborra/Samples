
public interface TestInter {
	
	default int getNumber() {
		int num = 1;
		
		return num;
	}
	
	static String getName() {
		String name = "Prasad";
		
		return name;
	}

}
