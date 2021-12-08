package com.study.controller;

import com.study.dto.HouseInfo;
import org.springframework.web.bind.annotation.*;


@RestController
public class HouseController {

	@GetMapping("/house/data")
	public HouseInfo getData() {
	    return new HouseInfo(1L, "深圳", "南山", "深圳湾一号");
	}
}
