package com.byteflair.elasticcamel.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.byteflair.elasticcamel.model.Place;
import com.byteflair.elasticcamel.util.SequenceGenerator;

@Controller
public class PlaceController {
	@Autowired
	ProducerTemplate webProducerTemplate;
	
	@RequestMapping(value = "/create-place", method = RequestMethod.GET)
	public String createPlace(Model model) {
		model.addAttribute("newPlace", new Place());
		
		return "createPlace";
	}
	
	@RequestMapping(value = "/create-place", method = RequestMethod.POST)
	public String createPlace(Place place, RedirectAttributes redirectAttributes) {
		place.setId(SequenceGenerator.next());
		
		webProducerTemplate.sendBody("direct:elastic.index.place", place);
		
		redirectAttributes.addFlashAttribute("createdPlace", place);
		
		return "redirect:/created-place";
	}
	
	@RequestMapping(value = "/created-place", method = RequestMethod.GET)
	public String createdPlace(Model model) {
		return "placeCreated";
	}
}