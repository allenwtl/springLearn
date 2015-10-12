package org.allen.springbeans.annotation;


import org.allen.springbeans.service.Caculater;
import org.allen.springbeans.service.CaculaterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration()
@ComponentScan(basePackages="org.allen.springbeans.bean")
public class AppConfig {
	
	@Bean
	public Caculater caculater (){
		return new CaculaterImpl();
	}
	

}
