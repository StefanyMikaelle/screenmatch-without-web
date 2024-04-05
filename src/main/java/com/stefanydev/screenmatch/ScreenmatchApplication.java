package com.stefanydev.screenmatch;

import com.stefanydev.screenmatch.dto.SerieDataDto;
import com.stefanydev.screenmatch.service.ApiService;
import com.stefanydev.screenmatch.service.DataTransform;
import com.stefanydev.screenmatch.service.DataTransformImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var apiService = new ApiService();
		var json = apiService.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		//json = apiService.getData("https://coffee.alexflipnote.dev/random.json");
		//System.out.println(json);
		DataTransform dataTransform = new DataTransformImpl();
		SerieDataDto serieDataDto = dataTransform.getData(json, SerieDataDto.class);
		System.out.println(serieDataDto);
	}
}
