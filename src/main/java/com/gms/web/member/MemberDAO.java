package com.gms.web.member;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.gms.web.command.CommandDTO;
@Repository 

public interface MemberDAO {
	public String insertMember(Map<?, ?> map);
	public List<?> selectAll(CommandDTO cmd);
	public String count(CommandDTO cmd);
	public StudentDTO selectById(CommandDTO cmd);
	public List<?> selectByName(CommandDTO cmd);
	public String updateProfile(MemberDTO bean);
	public String deleteUser(CommandDTO cmd);
	public MemberDTO login(CommandDTO cmd);

}
