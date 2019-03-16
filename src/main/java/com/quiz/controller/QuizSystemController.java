package com.quiz.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author siddharth pandey
 *
 */
@Controller
public class QuizSystemController {

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		return "index";
	}
	
	
}
