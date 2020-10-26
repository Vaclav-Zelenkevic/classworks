package lt.vtmc.housealarm;

public class AOSAPI {
	private AlarmOperationSystem aos;

	public AOSAPI() {
		this.aos = new AlarmOperationSystem();
	}
	
	public void enterCode(int code) {
		aos.checkCode(code);
	}
	
}
