package com.jose1593.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jose1593.web.dto.BoardDTO;
import com.jose1593.web.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	// pageNO (페이징)
	@GetMapping("/board")
	public String board(@RequestParam(name="pageNO", required = false, defaultValue = "1") int pageNo, Model model) {
									//					필수값 			값이 안들어오면 1이라 적어줘
		// pageNo === (pageNo - 1) * 10 => 10개씩 보여줘
		// 1페이지 => 0, 10  2페이지 => 10, 10  3페이지 20, 10 형태
		
		List<BoardDTO> list = boardService.list((pageNo - 1) * 10);
//		System.out.println("baord in");
//		System.out.println(list);
		model.addAttribute("list", list);
		return "board";
	}
	
	@GetMapping("/detail") 
	public String detail(@RequestParam(name="bno", required = true) int bno, Model model) {
//		System.out.println(dto.getBno); // 파라미터를 BoardDTO dto로 설정하면
		BoardDTO detail = boardService.detail(bno); 
		model.addAttribute("detail", detail);
		return "detail"; // properties에서 thymeleaf 호출시 경로설정 구문 추가하면 .html은 붙이지 않아도 된다
	}
	
	 
}
