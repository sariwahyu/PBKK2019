package id.web.tjokroaminoto.app;

import org.springframework.beans.factory.annotation.Value;

public class Neurologist implements Doctor {
	
	private Hospital hospital;

	@Value("${foo.iddoc}")
	private String iddoc;
	
	@Value("${foo.name}")
	private String name;
	
	public Neurologist() {
		
	}
	
	public Neurologist(Hospital hospital) {
		this.hospital = hospital;
	}


	public Hospital getHospital() {
		return hospital;
	}



	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	@Override
	public String getDailyClinic() {
		// TODO Auto-generated method stub
		return "Welcome to Neurologist, Doctor.";
	}

	public String getIddoc() {
		return iddoc;
	}

	public void setIddoc(String iddoc) {
		this.iddoc = iddoc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
