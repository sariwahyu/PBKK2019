package id.web.moumantai.hospital;

import java.util.LinkedHashMap;

import javax.validation.constraints.*;

public class Oncologist {
	
	@NotNull(message="Id Dokter tidak boleh kosong!")
	@Size(min=4, message="Id Dokter tidak sesuai")
	private String iddoc;
	
	@NotNull(message="Nama Dokter tidak boleh kosong!")
	private String name;
	
	private String address;
	
	@Email
	private String email;
	@NotEmpty (message="Status terkini harus diisi")
	private LinkedHashMap<String, String> status;
	@NotEmpty (message="Spesialis Harus dipilih")
	private String spesialisasi;
	@NotEmpty (message="Jadwal Praktek harus dipilih")
	private String jadwalPraktek;
	
	public Oncologist() {
		status = new LinkedHashMap<String, String>();
		status.put("Magang", "Magang");
		status.put("Tetap", "Tetap");
		status.put("Honorer", "Honorer");
	}
	
	public Oncologist(
			@NotNull(message = "Id Dokter tidak boleh kosong!") @Size(min = 4, message = "Id Dokter tidak sesuai") String iddoc,
			@NotNull(message = "Nama Dokter tidak boleh kosong!") String name, String address, @Email String email,
			@NotEmpty(message = "Status terkini harus diisi") LinkedHashMap<String, String> status,
			@NotEmpty(message = "Spesialis Harus dipilih") String spesialisasi,
			@NotEmpty(message = "Jadwal Praktek harus dipilih") String jadwalPraktek) {
		super();
		this.iddoc = iddoc;
		this.name = name;
		this.address = address;
		this.email = email;
		this.status = status;
		this.spesialisasi = spesialisasi;
		this.jadwalPraktek = jadwalPraktek;
	}
	public LinkedHashMap<String, String> getStatus() {
		return status;
	}
	public void setStatus(LinkedHashMap<String, String> status) {
		this.status = status;
	}
	public String getSpesialisasi() {
		return spesialisasi;
	}
	public void setSpesialisasi(String spesialisasi) {
		this.spesialisasi = spesialisasi;
	}
	public String getJadwalPraktek() {
		return jadwalPraktek;
	}
	public void setJadwalPraktek(String jadwalPraktek) {
		this.jadwalPraktek = jadwalPraktek;
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
	
}
