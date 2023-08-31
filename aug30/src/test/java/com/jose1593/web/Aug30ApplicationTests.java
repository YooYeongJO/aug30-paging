package com.jose1593.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jose1593.web.dto.LoginDTO;
import com.jose1593.web.service.LoginService;

@SpringBootTest
class Aug30ApplicationTests {

	// Junit = 자바에서 독립된 단위테스트를 지원해주는 프레임워크
	// 단정(assert) 메소드로 테스트 케이스의 수행결과를 판별한다.
	// Junit4 이후부터는 테스트를 지원 어노테이션을 제공한다. (@Test @Before @After 등)
	// @Test 메서드가 호출할 때마다 새로운 인스턴스를 생성하여 독립적인 테스트가 이루어지게 한다.
	
	@Autowired
	LoginService loginService;
	
	
	@Test
	@DisplayName("처음 테스트 해봐요")
	void contextLoads() {
		//DTO에 값을 담아서 DB에 물어보면 정말 값이 와요?
		LoginDTO dto = new LoginDTO();
		dto.setId("jose1593");
		dto.setPw("01234567");
		
		LoginDTO result = loginService.login(dto);
		
		assertEquals(result.getM_name(), "야");
		//assertNotNull(result);
		//assertSame(dto, result);
	}

}
