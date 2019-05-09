package com.tts.MapsApp;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@Service
public class MapService {
	@Value("${api_key}")
	private String apiKey;
	
	public void addCoordinates(Location location) {
		String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + 
				location.getCity() + "," + location.getState() + "&key=" + apiKey;	
		RestTemplate restTemplate = new RestTemplate();
		GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
		Location coordinates = response.getResults().get(0).getGeometry().getLocation();	
		location.setLat(coordinates.getLat());
		location.setLng(coordinates.getLng());
	}
	
	
	public void randomCoordinates(Location location1) {
		String url = "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + 
				location1.getRandLat() + "," + location1.getRandLng() + "&key=" + apiKey;
		
		RestTemplate restTemplate = new RestTemplate();
		GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
		Location coordinates1 = response.getResults().get(0).getGeometry().getLocation();	
		location1.setLat(coordinates1.getLat());
		location1.setLng(coordinates1.getLng());
		
	}	
	
	
}
