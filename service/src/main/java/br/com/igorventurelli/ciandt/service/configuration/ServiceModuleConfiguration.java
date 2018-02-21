package br.com.igorventurelli.ciandt.service.configuration;

import br.com.igorventurelli.ciandt.business.configuration.BusinessModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("br.com.igorventurelli.ciandt.service.service")
@Import(BusinessModuleConfiguration.class)
public class ServiceModuleConfiguration {
}
