package tn.msis.gpr.configuration;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfiguration {

	@Bean
	public DozerBeanMapper dozerBean() {
		List<String> mappingFiles = Arrays.asList("dozer-configration-mapping.xml");

		DozerBeanMapper dozerBean = new DozerBeanMapper();
		dozerBean.setMappingFiles(mappingFiles);

		return dozerBean;
	}
}
