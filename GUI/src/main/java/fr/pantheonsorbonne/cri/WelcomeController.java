package fr.pantheonsorbonne.cri;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

}
