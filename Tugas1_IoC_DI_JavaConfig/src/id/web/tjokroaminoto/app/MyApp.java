package id.web.tjokroaminoto.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MedicalConfig.class);
		
		Neurologist neuro = context.getBean("neurologist", Neurologist.class);
		
		System.out.println(neuro.getDailyClinic());
		System.out.println(neuro.getName());
		
		context.close();
	}

}
