package br.com.igorventurelli.ciandt.controller.configuration;

import br.com.igorventurelli.ciandt.service.configuration.ServiceModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("br.com.igorventurelli.ciandt.controller.endpoint")
@Import(ServiceModuleConfiguration.class)
public class ControllerModuleConfiguration {

}
