package com.jose1593.web.dto;

import lombok.Data;

@Data // lombok 사용해서 자동으로 get&setter 되도록
public class BoardDTO {
	
	private int bno, blike, commentcount;
	private String btitle, m_name, m_id;
	private String bdate, bcontent;

	
}
