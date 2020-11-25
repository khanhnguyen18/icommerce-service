package org.icommerce.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"org.icommerce.rest"})
@Import({ApplicationServiceConfiguration.class})
public class RestConfiguration {

}
