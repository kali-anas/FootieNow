package com.sabanciuniv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.sabanciuniv.service.FootieNowService;

@SpringBootApplication
@ComponentScan(basePackages = "com.sabanciuniv") // Ensure Spring scans all sub-packages
public abstract class FootieowApplication implements CommandLineRunner {

    @Autowired
    private FootieNowService footieNowService; // Service injected here

    public static void main(String[] args) {
        SpringApplication.run(FootieowApplication.class, args);
    }

	public FootieNowService getFootieNowService() {
		return footieNowService;
	}

	public void setFootieNowService(FootieNowService footieNowService) {
		this.footieNowService = footieNowService;
	}

    
}

