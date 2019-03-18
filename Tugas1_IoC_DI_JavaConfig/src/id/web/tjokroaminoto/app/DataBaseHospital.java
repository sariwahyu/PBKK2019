package id.web.tjokroaminoto.app;

import org.springframework.stereotype.Component;

@Component
public class DataBaseHospital implements Hospital {

	@Override
	public String getHospitalService() {
		// TODO Auto-generated method stub
		return "This is Hospital's Data Base";
	}

}
