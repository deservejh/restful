package kr.co.restful.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.restful.dto.MemberDto;

@Service
public class LoginService {
	
	PasswordEncoder passwordEncoder;
	
	@Autowired
    public LoginService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
	
	public boolean loginProcess(MemberDto memberDto, MemberDto dto) throws Exception{
        
        if (passwordEncoder.matches(memberDto.getPassword(), dto.getPassword())) {
			/* TODO 로그인 처리 추가 */
            return true;
        } else {
            return false;
        }
	}

}
