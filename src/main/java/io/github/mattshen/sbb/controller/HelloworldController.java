package io.github.mattshen.sbb.controller;

import io.github.mattshen.sbb.services.HelloworldService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class HelloworldController {

	private static final Logger	LOG =Logger.getLogger(HelloworldController.class);

	@Autowired
	private HelloworldService hs;

	@RequestMapping("/hello")
	public ResponseEntity<String> home(HttpServletRequest req) throws Exception {
		return new ResponseEntity<String>(hs.sayHello(), HttpStatus.OK);
	}

}