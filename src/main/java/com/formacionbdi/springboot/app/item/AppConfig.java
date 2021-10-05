package com.formacionbdi.springboot.app.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //permite crear objestos componentes de springs o "beans"
public class AppConfig {
	@Bean("clienteRest") //queda guardado en el contenedor de beans con este nombre. Con esto se puede inyectar este cliente http (en ItemServiceImpl) para poder acceder a recursos que estan en otros servicios
	@LoadBalanced //balancear carga con ribbon (se usa con RestTemplate )
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
}
