package kr.co.restful.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.restful.dto.CommonDto;

@RestController
public class IndexContoller {
	
	@GetMapping({"/index", "/"})
	public String index(Model model) {
		return "index";
	}
	
	@PostMapping("/test")
	public CommonDto test() {
		CommonDto commonDto = new CommonDto();
		commonDto.setIdx(1);
		commonDto.setId("deserve");
		commonDto.setName("park jun hyeok");
		commonDto.setPhone("010-6688-4333");
		commonDto.setSex("F");
		return commonDto;
	}

}
