package com.lms.lmstask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LmsController {
	@GetMapping(value="/lms")
	public String lms() {
		return "Lms Done!";
	}
}
