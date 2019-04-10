package fr.pantheonsorbonne.cri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.pantheonsorbonne.cri.dao.FeatureRepository;
import fr.pantheonsorbonne.cri.entities.Exigence;
import fr.pantheonsorbonne.cri.entities.Feature;

@Controller
public class FeatureController {

	    @Autowired
	    private FeatureRepository fr;
	    
	    
	    @RequestMapping("/createFeature")
		@ResponseBody
		public String createFeature() {
			  
		    
		    try {
		      Feature f = new Feature();
		      fr.save(f);
		    }
		    catch (Exception ex) {
		      return "Error creating the Featurex: " + ex.toString();
		    }
		    return "Feature succesfully created ";
		  }
	 
}
