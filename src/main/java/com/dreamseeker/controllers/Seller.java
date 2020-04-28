package com.dreamseeker.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {
	
	private Long id;
	private String name;
	private double tasa;

}
