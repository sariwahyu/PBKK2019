package id.web.moumantai.hospital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "Form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "Process";
	}

}
