package id.web.tjokroaminoto.app;

public class Cardiologist implements Doctor {
	
	private Hospital hospital;

	public Cardiologist() {

	}
	
	public Cardiologist(Hospital theHospital) {
		hospital = theHospital;
	}

	public Hospital getHospital() {
		return hospital;
	}


	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}


	@Override
	public void getDailyClinic() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Cardiologist, Doctor.");
		
	}
	
	
	
}
