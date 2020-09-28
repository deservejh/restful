package kr.co.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.restful.dto.ErrorResponse;
import kr.co.restful.dto.MemberDto;
import kr.co.restful.dto.Result;
import kr.co.restful.dto.SuccessResponse;
import kr.co.restful.service.LoginService;
import kr.co.restful.service.MemberService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	MemberService memberService;
	
	@PostMapping("/user/login")
	public Result login(MemberDto memberDto) throws Exception {

	    //MemberDto dto = memberService.selectMember(memberDto);
		MemberDto dto = null;
	    
	    if (dto != null) {
	    	Boolean result = loginService.loginProcess(memberDto, dto);
	    	if(result) {
	    		return Result.builder().success(SuccessResponse.builder().code(200).message("성공").build()).build();
	    	} else {
	    		return Result.builder().error(ErrorResponse.builder().code(500).message("실패").build()).build();
	    	}
	    }
	    return Result.builder().error(ErrorResponse.builder().code(500).message("실패").build()).build();
	}

}
