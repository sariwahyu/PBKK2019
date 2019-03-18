package id.web.tjokroaminoto.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import id.web.tjokroaminoto.app.Hospital;;

//@Component("myDermatologist")

//Default bean ID : dermatologist
@Component
public class Dermatologist implements Doctor {
	//dependency injection using field directly
		@Autowired
		@Qualifier ("dataBaseHospital")
		private Hospital hospital;
		
		public Dermatologist() {
			// TODO Auto-generated constructor stub
		}
		
		//dependency injection using constructor
		//@Autowired
		public Dermatologist(Hospital hospital) {
			this.hospital = hospital;
		}
		
		public Hospital getHospital() {
			return hospital;
		}
		
		//dependency injection using setter / mutator
		//@Autowired
		public void setHospital(Hospital hospital) {
			this.hospital = hospital;
		}

		@Override
		public String getDailyClinic() {
			// TODO Auto-generated method stub
			return "Welcome to Dermatologist, Doctor";
		}
		


}
