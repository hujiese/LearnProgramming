package com.study.controller;

import com.study.dto.HouseInfo;
import org.springframework.web.bind.annotation.*;


@RestController
public class HouseController {

	@GetMapping("/house/data") 	
	public HouseInfo getData(@RequestParam("name") String name) {
	    return new HouseInfo(1L, "深圳", "南山", "深圳湾一号");
	}  
	
	@GetMapping("/house/data/{name}") 	
	public String getData2(@PathVariable("name") String name) { 	 
	    return name; 	
	} 
	
	@PostMapping("/house/save")
	public Long addData(@RequestBody HouseInfo houseInfo) {       
		System.out.println(houseInfo.getName());       
		return 1001L; 
	}
}
