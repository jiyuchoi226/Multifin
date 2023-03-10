package com.multi.multifin.member.model.vo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberForm {
	@NotNull(message = "id가 입력되지 않았습니다.")
	@Size(max = 6, min = 2, message = "닉네임을 2글자 이상, 6글자 미만 입력바랍니다.")
	private String id;
	
	@NotNull(message = "pw가 입력되지 않았습니다.")
	@Size(max = 20, min = 4, message = "패스워드를 4글자 이상, 20글자 미만 입력바랍니다.")
	private String password;

	@NotNull(message = "이름이 입력되지 않았습니다.")
	@Size(max = 20, min = 2, message = "이름을 2글자 이상, 20글자 미만 입력바랍니다.")
	private String name;
	
	@NotNull(message = "휴대폰 번호가 입력되지 않았습니다.")
	@Size(max = 11, min = 11, message = "올바른 전화번호가 아닙니다.")
	private String phone;
	private String email;
	private String address;
	@NotNull(message = "질문이 입력되지 않았습니다.")
	private String answer1;
	@NotNull(message = "답이 입력되지 않았습니다.")
	private String answer2;
	
	
	public Member toMember(){
		return new Member(0, id, password, null, name, phone, email, address, (answer1+answer2), address, null, null);
	}
}
