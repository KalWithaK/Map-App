package com.tts.MapsApp;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

@SpringBootApplication
@Data
public class GeocodingResponse {
	private List<Geocoding> results;

}
