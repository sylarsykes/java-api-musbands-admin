package org.java.api.musbands.admin.application.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Default configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@Configuration
@ComponentScan({ "org.java.api.musbands.admin.function.members.*" })
public class MusbandsAdminApiApplicationConfiguration {

	/**
	 * Model mapper bean
	 * 
	 * @return ModelMapper
	 */
	@Bean
	@Scope("prototype")
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
