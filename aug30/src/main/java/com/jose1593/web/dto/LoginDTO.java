package com.jose1593.web.dto;

import lombok.Data;

@Data // lombok을 사용하는 자동으로 getter&setter 해준다
public class LoginDTO {
	
	private int count;
	private String id, pw, m_name;

}
