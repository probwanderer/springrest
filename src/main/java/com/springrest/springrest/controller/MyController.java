package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.springrest.services.LoadService;
import com.springrest.springrest.entities.Load;

@RestController
public class MyController {
	@Autowired
	private LoadService loadService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	// get the load
	@GetMapping("/load")
	public List<Load>getLoad(){
		return this.loadService.getLoad();
	}
	@GetMapping("/load/{loadId}")
	public Load getLoad(@PathVariable String loadId) {
		return this.loadService.getLoad(Long.parseLong(loadId));
	}
	@PostMapping(path = "/load", consumes="application/json")
	public Load addLoad(@RequestBody Load load) {
		return this.loadService.addLoad(load);
	}
	@PutMapping("/load")
	public Load updateLoad(@RequestBody Load load) {
		return this.loadService.updateLoad(load);
	}
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId){
		try {
			this.loadService.deleteLoad(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
