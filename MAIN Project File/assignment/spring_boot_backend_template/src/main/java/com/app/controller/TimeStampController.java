package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.SampleDataIml;

@RestController
@RequestMapping("/stamp")
public class TimeStampController {
	
	@Autowired
	private SampleDataIml sample;
	
	@GetMapping
	public ResponseEntity<?> getAlldetails() {
		System.out.println("in get all " );
		return ResponseEntity
				.ok(sample.getAllstamp());
	}
	
	@GetMapping("/{onehr}")
	public ResponseEntity<?> getAllOnehr1(@PathVariable Long hr) {
		
		return ResponseEntity
				.ok(sample.getonehr(hr));

	}
	
	@GetMapping("/{eighthr}")
	public ResponseEntity<?> getAllEighthr(@PathVariable Long hrr) {
		
		return ResponseEntity
				.ok(sample.getEighthr(hrr));

	}
	
	@GetMapping("/{twentyfourhr}")
	public ResponseEntity<?> getAlltwentyFourthr(@PathVariable Long hrrr) {
		
		return ResponseEntity
				.ok(sample.getTwentyForthhr(hrrr));

	}

}
