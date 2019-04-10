package fr.pantheonsorbonne.cri.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.pantheonsorbonne.cri.dao.ExigenceRepository;
import fr.pantheonsorbonne.cri.dao.VerifierRepository;
import fr.pantheonsorbonne.cri.entities.Exigence;
import fr.pantheonsorbonne.cri.entities.Verifier;


@Controller
public class ExigenceController {
	
	@Autowired
	private ExigenceRepository er;
	
	  @RequestMapping("/createExigence")
	  @ResponseBody
	  public String create(String txt) {
		  
	    String Id = "";
	    try {
	      Exigence exg = new Exigence(txt);
	      er.save(exg);
	    }
	    catch (Exception ex) {
	      return "Error creating the verifier: " + ex.toString();
	    }
	    return "Exigence succesfully created";
	  }
	 
	

}
