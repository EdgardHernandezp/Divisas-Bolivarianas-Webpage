package com.dreamseeker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.client.RestTemplate;

import com.dreamseeker.model.responseBodies.TasaActual;

@Controller
public class MainController {

	@GetMapping("/tasas")
	public String getTasas(Model model) {
		RestTemplate rest = new RestTemplate();
		TasaActual tasaActual = rest.getForObject("http://localhost:9090/tasas", TasaActual.class);
		model.addAttribute("tasas", tasaActual);
		return "tasas";
	}
	
	@GetMapping("/sellers/update")
	public String inputNewSellerInfo(Model model) {
		return "addNew";
	}
	
	@PostMapping("/sellers/update")
	public String updateSeller(Long id, String name, Double tasa) {
		Seller seller = new Seller(id, name, tasa);
		System.out.println("Seller: " + seller.toString());
		RestTemplate rest = new RestTemplate();
		rest.put("http://localhost:9090/sellers/" + seller.getId(), seller);
		return "addNew";
	}
}
