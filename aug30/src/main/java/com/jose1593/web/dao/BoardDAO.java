package com.jose1593.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jose1593.web.dto.BoardDTO;

@Mapper // mapper는 interface로 
public interface BoardDAO {

	List<BoardDTO> list(int pageNo);

	BoardDTO detail(int bno);

}
