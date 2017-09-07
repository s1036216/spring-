package com.gms.web.member;

import java.io.Serializable;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data @Lazy @Component
public class MemberDTO implements Serializable{
	
	private String id, pw, ssn,name,regedate,email,major,subject,phone,profile,birthday,gender;
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", pw=" + pw + ", ssn=" + ssn + ", name=" + name + ", regedate=" + regedate
				+ ", email=" + email + ", major=" + major + ", subject=" + subject + ", phone=" + phone + ", profile="
				+ profile + ", birthday=" + birthday + ", gender=" + gender + "]";
	}
	
}
