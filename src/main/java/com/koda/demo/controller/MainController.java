package com.koda.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koda.demo.config.SessionConstants;

@RestController
public class MainController {
	
	private HttpSession httpSession;
	
	public MainController(HttpSession httpSession) {
		this.httpSession = httpSession;
	}
	
	@GetMapping("/me")
    public Map<String, Object> me(){
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("profile", httpSession.getAttribute(SessionConstants.LOGIN_USER));
        System.out.println(response.toString());
        return response;
    }
}
