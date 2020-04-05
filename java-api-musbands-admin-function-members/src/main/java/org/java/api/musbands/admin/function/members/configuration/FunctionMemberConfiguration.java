package org.java.api.musbands.admin.function.members.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Juan
 *
 */
@Configuration
@EntityScan("org.java.api.musbands.admin.function.members.domain")
@ComponentScan({ "org.java.api.musbands.admin.function.members.*" })
@EnableJpaRepositories(basePackages = {"org.java.api.musbands.admin.function.members.repository" })
public class FunctionMemberConfiguration {

}
