package com.tts.MapsApp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

@SpringBootApplication

@Data
public class Geocoding {
	private Geometry geometry;

}
