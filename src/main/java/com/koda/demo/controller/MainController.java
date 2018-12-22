package com.koda.demo.controller;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koda.demo.config.SessionConstants;
import com.koda.demo.domain.User;

@RestController
public class MainController {
	
	private HttpSession httpSession;
	
	public MainController(HttpSession httpSession) {
		this.httpSession = httpSession;
	}
	
	@GetMapping("/me")
    public String me(){
        User user = (User)httpSession.getAttribute(SessionConstants.LOGIN_USER);
        StringBuilder builder = new StringBuilder();
        return builder.append("username : ")
        			.append(user.getName())
        			.append("useremail :")
        			.append(user.getEmail())
        			.toString();
    }
	
//	@RequestMapping("/user")
//	public Principal user(Principal principal) {
//		return principal;
//	}
}
