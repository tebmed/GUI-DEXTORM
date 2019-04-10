package fr.pantheonsorbonne.cri.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import fr.pantheonsorbonne.cri.dao.ReportRepository;
import fr.pantheonsorbonne.cri.entities.Report;


@Controller
public class ReportControllers {
	
	 @Autowired
	 private ReportRepository rr;
	    
	    
	    @RequestMapping("/createReport")
		@ResponseBody
		public String createReport() {
			  
		    
		    try {
		      Report r = new Report();
		      rr.save(r);
		    }
		    catch (Exception ex) {
		      return "Error creating the Report: " + ex.toString();
		    }
		    return "Report succesfully created ";
		  }
	

}
