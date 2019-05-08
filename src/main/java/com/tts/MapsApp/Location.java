package com.tts.MapsApp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

@SpringBootApplication
@Data
public class Location {
	private String city;
	private String state;
	private String lat;
	private String lng;

}
