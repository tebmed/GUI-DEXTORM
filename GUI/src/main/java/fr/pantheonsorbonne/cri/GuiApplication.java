package fr.pantheonsorbonne.cri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GuiApplication extends SpringBootServletInitializer {

	
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GuiApplication.class);
    }
	public static void main(String[] args) throws Exception{
		SpringApplication.run(GuiApplication.class, args);
	}
	  

	
}
