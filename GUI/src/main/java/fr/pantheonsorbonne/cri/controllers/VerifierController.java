package fr.pantheonsorbonne.cri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import fr.pantheonsorbonne.cri.dao.VerifierRepository;
import fr.pantheonsorbonne.cri.entities.Verifier;

@Controller
public class VerifierController {
	
	 @Autowired
	 private VerifierRepository verfierRepository;
	 
	
	  @RequestMapping("/createVerifier")
	  @ResponseBody
	  public String create(String name) {
		  
	    try {
	      Verifier verifier = new Verifier(name, 0, null);
	      verfierRepository.save(verifier);
	    }
	    catch (Exception ex) {
	      return "Error creating the verifier: " + ex.toString();
	    }
	    return "Verifier succesfully created with name = " + name;
	  }
	 
	

}
