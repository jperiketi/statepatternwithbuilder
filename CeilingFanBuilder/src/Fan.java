
public class Fan {
	
	FanState bearing;
	FanState motor;
	FanState wings;
	FanState colour;
	
	FanState fanState;
	
	public Fan() {
		bearing = new Bearing(this);
		motor = new Motor(this);
		wings = new Wings(this);
		colour = new Colour(this);
		
		fanState = bearing;
		
	}
	
	void setFanState(FanState state) {
		fanState = state;
	}
	
	public void insertBearing() {
		fanState.insertBearing();
	}
	
	public void insertMotor() {
		fanState.insertMotor();
	}
	
	public void insertWings() {
		fanState.insertWings();
	}
	public void insertColour() {
		fanState.insertColour();
	}
	
	public FanState getBearingState() { return bearing; }
	public FanState getMotorState() { return motor; }
	public FanState getWingsState() { return wings; }
	public FanState getColourState() { return colour; }
	
}
