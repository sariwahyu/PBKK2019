package id.web.moumantai.hospital;

public class Oncologist implements Doctor {
	
	private Hospital hospital;
	private String iddoc;
	private String name;
	private String address;
	private String email;
	
	@Override
	public void getDailyClinic() {
		System.out.println("Welcome to Oncologist, Doctor.");
		
	}
	
	public Oncologist(Hospital hospital, String iddoc, String name, String address, String email) {
		super();
		this.hospital = hospital;
		this.iddoc = iddoc;
		this.name = name;
		this.address = address;
		this.email = email;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Oncologist() {
		
	}
	
	public Oncologist(Hospital theHospital) {
		hospital = theHospital;
	}
	
	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

}
