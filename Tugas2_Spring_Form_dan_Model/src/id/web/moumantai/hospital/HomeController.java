package id.web.moumantai.hospital;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

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
		String theName = request.getParameter()
		return "Process";
	}

}
