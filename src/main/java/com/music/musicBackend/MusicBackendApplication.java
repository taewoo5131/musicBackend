package com.music.musicBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicBackendApplication.class, args);
		System.out.println("run musicBackend!");
	}

}
