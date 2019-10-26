package Java8.Threads;

public class SampleMainEx {

	public static void main(String[] args) {

		Car car = () -> {
			System.out.println("Hey Heloooooooo");
		};
		car.getCarName();

		Runnable r = () ->{
			System.out.println("Implementation for run method");
		};
		
		Thread th = new Thread(r);
		th.start();
	}

}
