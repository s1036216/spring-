package com.gms.web.mapper;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.gms.web.command.CommandDTO;
import com.gms.web.member.MemberDTO;
import com.gms.web.member.StudentDTO;
@Repository 

public interface MembeMapper {
	public String insertMember(Map<?, ?> map);
	public List<?> selectAll(CommandDTO cmd);
	public String count(CommandDTO cmd);
	public StudentDTO selectById(CommandDTO cmd);
	public List<?> selectByName(CommandDTO cmd);
	public String updateProfile(MemberDTO bean);
	public String deleteUser(CommandDTO cmd);
	public MemberDTO login(CommandDTO cmd);

}