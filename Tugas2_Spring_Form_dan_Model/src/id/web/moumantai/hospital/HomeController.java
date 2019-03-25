package id.web.moumantai.hospital;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/showForm", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("Form", "showForm", new Oncologist());
	}
	
	@RequestMapping(value="/processForm", method = RequestMethod.POST)
	public String processForm(@Validated @ModelAttribute ("oncologist")Oncologist oncologist, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
            return "error";
        }
		
		model.addAttribute("iddoc", oncologist.getIddoc());
        model.addAttribute("name", oncologist.getName());
        model.addAttribute("address", oncologist.getAddress());
        model.addAttribute("email", oncologist.getEmail());
        
		return "Process";
	}

}
