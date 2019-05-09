package com.tts.MapsApp;



import java.text.DecimalFormat;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

@SpringBootApplication
@Data
public class Location {
	private String city;
	private String state;
	private Double lat;
	private Double lng;
	
	private String pattern = "##.####";
	private DecimalFormat df = new DecimalFormat(pattern);
	
	private String randLat = df.format((-90 +(Math.random() * 180))) ;
	private String randLng =  df.format((-180 + (Math.random() * 360)));
	
	
	


}

	

