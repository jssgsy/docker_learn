package com.univ.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author univ 2022/11/24 09:41
 */
@RestController
@RequestMapping("/home")
@Slf4j
public class HomeController {

	@GetMapping("/ok")
	public String ok() {
		log.info("ok");
		return "ok";
	}

}
