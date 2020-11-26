package org.icommerce;

import org.icommerce.config.RestConfiguration;
import org.icommerce.data.config.DataJpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        RestConfiguration.class,
        DataJpaConfiguration.class,
})
public class ICommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ICommerceApplication.class, args);
	}

}
