package com.jose1593.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

	@GetMapping("/") // 첫 페이지 열기
	// 한글 문제???? English OK?
	public String index() {
		return "index";
	}
	
//	// 크롤링 2023-08-31
//	@GetMapping("/cliensdjfghakj;gas;lgjnasdlgnaldnglawndg;lknmdsagnasl;dgn;laksnb;lkasnblknsda;lkfn") 
//	public String clien(Model model) throws IOException {
//		Document clien = Jsoup.connect("https://www.clien.net/").get();
//		Elements somoim = clien.select(".somoim"); // 클래스라 앞에 .이 붙는다
//		// System.out.println(somoim);
//		List<String> list = new ArrayList<>();
//		for(Element e : somoim) {
//			// System.out.println(e.text());
//			list.add(e.text());
//		}
//		model.addAttribute("list", list);
//		return "clienasfasf";
//	}
	
}
