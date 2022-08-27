package com.weigao.real.estat.app;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weigao.real.estat.app.domain.Home;
import com.weigao.real.estat.app.service.HomeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class RealEstateAppWeiGaoApplication {

	public static void main(String[] args) {

		SpringApplication.run(RealEstateAppWeiGaoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(HomeService homeService){
		return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Home>> typeReference = new TypeReference<List<Home>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/homes.json");
			try {
				List<Home> homes = mapper.readValue(inputStream,typeReference);
				homeService.save(homes);
				System.out.println("Homes Saved!");
			} catch (IOException e){
				System.out.println("Unable to save homes: " + e.getMessage());
			}
		};
	}

}
