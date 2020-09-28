package kr.co.restful.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kr.co.restful.entity.Member;
import kr.co.restful.repository.MemberRepository;

@Service
public class MemberService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	MemberRepository memberRepository;
	
	public Page<Member> selectMemberList(Pageable pageable) throws Exception{
		
		return memberRepository.findAll(pageable);
	}

}
