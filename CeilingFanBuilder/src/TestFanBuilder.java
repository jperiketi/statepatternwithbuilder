
public class TestFanBuilder {

	public static void main(String[] args) {
		
		Fan fan = new Fan();
		
		System.out.println("fan with different States:\n");
		
		fan.insertBearing();
		fan.insertWings();
		fan.insertMotor();
		fan.insertColour();

	}

}
