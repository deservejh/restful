package kr.co.restful.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result {
	
	private Object payload;
	private ErrorResponse error;
	private SuccessResponse success;

}
