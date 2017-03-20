package tn.msis.gpr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import tn.msis.gpr.domain.Engin;
import tn.msis.gpr.repository.EnginRepository;

@SpringBootApplication // (exclude = {SecurityAutoConfiguration.class })
@EnableAutoConfiguration
public class GprProjectApplication implements CommandLineRunner{
	
	@Autowired
	private EnginRepository enginRepository;

	public static void main(String[] args) {
		SpringApplication.run(GprProjectApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		//Stream.of("tracteur", "vehicule 2").forEach(e->enginRepository.save(new Engin(e)));
		//enginRepository.findAll().forEach(e->System.out.println(e.getReference()));
		/*enginRepository.save(new Engin("eg_00", "tracteur"));
		enginRepository.save(new Engin("eg_01", "trax"));
		enginRepository.save(new Engin("eg_02", "tracteur"));*/
	}
}

/*@Configuration
class MyRestRepositoryConfig extends RepositoryRestMvcConfiguration {
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config){
		config.exposeIdsFor(Engin.class);
	}
}*/











