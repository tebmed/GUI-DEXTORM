package fr.pantheonsorbonne.cri;

import java.util.ArrayList;

import org.eclipse.egit.github.core.Issue;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.IssueService;
import org.eclipse.egit.github.core.service.RepositoryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GuiApplication extends SpringBootServletInitializer {

	
	static ArrayList<String> issues;
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GuiApplication.class);
    }
	public static void main(String[] args) throws Exception{
		SpringApplication.run(GuiApplication.class, args);
		
		final String user = "nh-group";
		RepositoryService service = new RepositoryService();
		IssueService is = new IssueService();
        issues = new ArrayList<String>();
		for (Repository repo : service.getRepositories(user)) {
		  // System.out.println(repo.getName());
          if(repo.getName().toString().trim().equals("basic-cli-uni")) {
			//System.out.println(MessageFormat.format(format, count++, repo.getName(), repo.getCreatedAt()));
             for (int i = 1; i <= 18; i++) {
            	 Issue issue = is.getIssue(user, repo.getName().toString(), i);
          	     System.out.println(issue.getTitle());
          	     issues.set(i, issue.getTitle());
			  }
          }
	  	 }
		
	}
	  
  
	
}
