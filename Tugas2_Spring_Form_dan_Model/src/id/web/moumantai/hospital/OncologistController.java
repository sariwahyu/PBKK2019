package id.web.moumantai.hospital;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/oncologist")
public class OncologistController {
	
	//binding
	@RequestMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("oncologist", new Oncologist());
		return "Form";
	}
	
	@RequestMapping("/process")
	public String processForm(@Validated @ModelAttribute("oncologist")Oncologist oncologist,
			BindingResult bindingResult, ModelMap model) {
	
		if(bindingResult.hasErrors()) {
			return "Form";
		}
		
		else {
			return "Process";
		}
	}

}
