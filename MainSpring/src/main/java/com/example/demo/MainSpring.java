package com.example.demo;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainSpring {
@Autowired
Vista interf;
	public static void main(String[] args) {
		SpringApplication.run(MainSpring.class, args);
               
	}
        @Bean
        ApplicationRunner jose(){
            return args->{
                final Log logger=LogFactory.getLog(getClass());
                //Añadir filas
                //consecionario a=new consecionario("joseioiu","Alvares","jose@g","3242115");
                //interf.save(a);
                //leer solo un objeto
                //consecionario jui=interf.findById(0).get();
                //interf.info(jui);
                //leer
                List<consecionario> resu=(List<consecionario>)interf.findAll();
                logger.info(resu);
                //actualizar
                //consecionario jui=interf.findById(1).get();
                //jui.setNombre("JOselito");
                //interf.save(jui);
                //eliminar
                interf.deleteById(1);
            };
}

}
