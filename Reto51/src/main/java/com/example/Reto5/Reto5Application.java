package com.example.Reto5;

import Controlador.Vamoo;
import Vista.Actualizar;
import Vista.Facha;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Reto5Application {
@Autowired
INterfaz inter;
	public static void main(String[] args) {
		//SpringApplication.run(Reto5Application.class, args);
                SpringApplicationBuilder builder=new SpringApplicationBuilder(Reto5Application.class);
                builder.headless(false);
                ConfigurableApplicationContext cont=builder.run(args);
	}
@Bean
ApplicationRunner runner(){
return args->{
final Log logger=LogFactory.getLog(getClass());
Vamoo cot=new Vamoo(new Actualizar(),inter,new Facha());
        };}

}
