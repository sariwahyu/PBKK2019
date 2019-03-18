package id.web.tjokroaminoto.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:support.properties")
public class MedicalConfig {
	//IoC
		//Create object
		@Bean
		public Doctor neurologist() {
			Neurologist neurologist = new Neurologist();
			return neurologist;
		}
		
		@Bean
		public Hospital office() {
			return new Office();
		}
		
		@Bean
		public Doctor neurologist(Hospital hospital) {
			Neurologist neuro = new Neurologist(office());
			return neuro;
		}

}
