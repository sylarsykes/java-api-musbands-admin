package org.java.api.musbands.admin.application.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Juan
 *
 */
@Configuration
@PropertySource({ "classpath:database.properties" })
public class MusbandsAdminApiApplicationDatabaseConfiguration {

	@Autowired
	private DataSourceProperties dataSourceProperties;

	@Bean
	@Primary
	public DataSource dataSource() {
		return DataSourceBuilder.create().username(dataSourceProperties.getUsername())
				.password(dataSourceProperties.getPassword()).url(dataSourceProperties.getUrl()).build();
	}

}
