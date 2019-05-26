package car;


public class Car implements Runnable
{
	public int road = 0; 
	private int speed;
	public Car(int speed) {
		this.speed = speed;
	}
	
	
	@Override
	public void run() {
		while(true) {
		if(road <= 100) {
			int nroad = ((speed * 1000)/3600);
			try {
				Thread.sleep(1000);
				System.out.println(road);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			road = road + nroad;
		}else {
			break;
		}
		}
	}

}
