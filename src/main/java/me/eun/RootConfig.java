package me.eun;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = {
		"classpath:security/security-context.xml"
})

public class RootConfig {
	

}
