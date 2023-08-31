package com.jose1593.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jose1593.web.dto.LoginDTO;

@Mapper // mapper는 interface라 적어줘야 함
public interface LoginDAO {

	LoginDTO login(LoginDTO dto);
	

}
