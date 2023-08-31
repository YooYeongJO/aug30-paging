package com.jose1593.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jose1593.web.dto.LoginDTO;
import com.jose1593.web.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(LoginDTO dto, HttpSession session) {
		System.out.println(dto.toString()); // LoginDTO(id=jose1593, pw=01234567)
		// lombok이 있어서 toString 사용 가능하다
		LoginDTO result = loginservice.login(dto); // count(*) 이름, 아이디
		System.out.println(result.toString());
		// LoginDTO(count=1, id=jose1593, pw=null, m_name=유영조)
		
		if(result != null && result.getCount() == 1) { // 정상적으로 로그인 되었을 때
			// 세션 만들어주겠습니다.
			session.setAttribute("mname", result.getM_name());
			session.setAttribute("mid", dto.getId());
			// return new RedirectView("/board"); // thymeleaf -> redirect
			return "redirect:/board";
		} else {
			// return new RedirectView("/login"); // thymeleaf -> redirect
			return "redirect:/login";
		}
	}
	
}
