package lab5;

public class TestDrivenProgramming {

	public static void main(String[] args) {

		testIsInCircle();
		System.out.println("");
		testGetPositiveCount();
	}
	
	public static void testIsInCircle(){
		System.out.println(isInCircle(50, 50, 50, -10, -10));
		System.out.println(isInCircle(50, 50, 50, 50, 50));
		System.out.println(isInCircle(50, 50, 50, 150, 150));
		System.out.println(isInCircle(50, 50, 50, 150, 50));
		System.out.println(isInCircle(50, 50, 50, 50, 150));
	}
	
	public static boolean isInCircle(double centerX, double centerY, double radius, double mouseX, double mouseY){
		//return false;
		if (mouseX > centerX - radius && mouseX < centerX + radius && mouseY > centerY - radius && mouseY < centerY + radius){
			return true;
		} else {
			return false;
		}
	}
	
	public static void testGetPositiveCount(){
		System.out.println(0 == getPositiveCount("------------------"));
		System.out.println(8 == getPositiveCount("++++++++"));
		System.out.println(10 == getPositiveCount("-+-++++--+-+-+++"));
		System.out.println(5 == getPositiveCount("==eggafsfvoiw++-f++gwg5+"));
	}
	
	public static int getPositiveCount(String opinionPoll){
		int positiveCounter = 0;
		for (int i = 0; i < opinionPoll.length(); i++){
			if (opinionPoll.charAt(i) == '+'){
				positiveCounter++;
			}
		}
		//return -1;
		return positiveCounter;
	}
}
