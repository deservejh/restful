package kr.co.restful.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Member {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long idx;
	private String id;
	private String password;
	private String name;
	private String tel;
	private String phone;
	private String sex;
	private Date birth_date;
	private Date reg_date;
	private Date mod_date;
	private Date login_date;

}
