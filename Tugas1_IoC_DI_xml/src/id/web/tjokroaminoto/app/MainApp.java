package id.web.tjokroaminoto.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlconfig.xml");
		
		Doctor doctor = context.getBean("myDoctor", Doctor.class);
		
		doctor.getDailyClinic();
		
		Oncologist oncologist = (Oncologist)doctor;
		System.out.println(oncologist.getHospital().getHospitalService());
		System.out.println(oncologist.getIddoc());
		System.out.println(oncologist.getName());
//		System.out.println(oncologist.getAddress());
//		System.out.println(oncologist.getEmail());
		
		//Bean scope : singleton
		Oncologist doctor1 = context.getBean("myDoctor", Oncologist.class);
		Oncologist doctor2 = context.getBean("myDoctor", Oncologist.class);
		System.out.println("doctor1: " + doctor1);
		System.out.println("doctor2: " + doctor2);
		
		doctor2.setName("Diganti");
		System.out.println("doctor1: " + doctor1.getName());
		System.out.println("doctor2: " + doctor2.getName());
		
		Oncologist doctor3 = context.getBean("myDoctorPrototype", Oncologist.class);
		Oncologist doctor4 = context.getBean("myDoctorPrototype", Oncologist.class);
		System.out.println("doctor3: " + doctor3);
		System.out.println("doctor4: " + doctor4);
		
		doctor3.setName("Bukan Test");
		System.out.println("doctor3: " + doctor3.getName());
		System.out.println("doctor4: " + doctor4.getName());
		context.close();
		

	}

}
