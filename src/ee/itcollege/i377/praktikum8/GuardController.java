package ee.itcollege.i377.praktikum8;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GuardController {
	
	private Logger log = LoggerFactory.getLogger(GuardController.class);
	
	@RequestMapping(value="/guardForm", method=RequestMethod.GET)
	public String guardForm(Model model) {
		log.debug("Successful guardform request");
		
		model.addAttribute("guard", new Guard());
		
		return "guard";
	}
	
	@RequestMapping(value="/guardForm", method=RequestMethod.POST)
	public String guardFormPost(@ModelAttribute @Valid Guard guard, BindingResult result, Model model) {
		if (result.hasErrors()) {
			log.debug("Valvuri valideerimisel tekkis viga");
			return "guard";
		}
		
		log.debug("Adding a new guard. Name: " + 
				guard.getName() + " Age: " + 
				guard.getAge() + " ID: " + 
				guard.getIdentificationCode());
		//TODO: salvesta valvur baasi
		return "guard";
	}



}
