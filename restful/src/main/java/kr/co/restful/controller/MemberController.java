package kr.co.restful.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.restful.dto.Constants;
import kr.co.restful.entity.Member;
import kr.co.restful.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@GetMapping("/member/list/{page}")
	public Page<Member> memberList(@PathVariable Optional<Integer> page) throws Exception {
		Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, Constants.pageSize);
		return service.selectMemberList(pageable);
	}

}
