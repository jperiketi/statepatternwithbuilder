
public class Wings implements FanState {

	Fan fan;
	
	public Wings(Fan newFan) {
		
		fan = newFan;
	
	}
	@Override
	public void insertBearing() {
		
		System.out.println("Bearing is added in the fan");
		fan.setFanState(fan.getBearingState());
	}

	@Override
	public void insertMotor() {
		
		System.out.println("Motor is added in the fan");
		fan.setFanState(fan.getMotorState());
		

	}

	@Override
	public void insertWings() {
		System.out.println("Wings are added in the fan");
		

	}

	@Override
	public void insertColour() {
		
		System.out.println("Colour is applied to the fan");
		fan.setFanState(fan.getColourState());

	}

}
