package kr.co.restful.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuccessResponse {
	
	private int code;
	private String message;

}
