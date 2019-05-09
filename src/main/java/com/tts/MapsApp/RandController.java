package com.tts.MapsApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RandController {

	@Autowired
	private MapService mapService;
	
	@GetMapping("/index")
	public String getDefaultMap(Model model) {
		model.addAttribute(new Location());		
		return "index.html";
		
	}
	
	@RequestMapping(value = "/rand", method = RequestMethod.GET) 
	public String displayRandMap(Model model) { 
	    model.addAttribute("location1", new Location()); 
	    return "index.html"; 
	}
	
	@PostMapping("/rand")
	public String getMapForCoord(Location location1, Model model) {
	    mapService.randomCoordinates(location1);
	    model.addAttribute("randLat");
	    model.addAttribute("randLng");
	    return "index.html";
	}
}
