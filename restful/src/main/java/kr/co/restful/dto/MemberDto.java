package kr.co.restful.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class MemberDto {

	private Long idx;
	private String id;
	private String password;
	private String name;
	private String tel;
	private String sex;
	private Date reg_date;

}
