package com.hdu.neurostudent_paradigm;

import com.hdu.neurostudent_paradigm.config.ParadigmConfig;
import com.hdu.neurostudent_paradigm.utils.ConfigManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan("com.hdu")
public class NeuroStudentParadigmApplication {
	public static void main(String[] args) {
		SpringApplication.run(NeuroStudentParadigmApplication.class, args);
	}
}
