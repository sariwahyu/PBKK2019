package id.web.tjokroaminoto.app;

import org.springframework.stereotype.Component;

@Component
public class Office implements Hospital {

	@Override
	public String getHospitalService() {
		// TODO Auto-generated method stub
		return "Welcome to Tjokroaminoto Hospital";
	}

}
