package com.us.rk.model.dao;

import com.us.rk.model.dto.MemberBean;

public interface MemberMapper {
	public void insertMember(MemberBean memberBean);
	//MemberBean loginCheck(MemberBean memberBean);

	public int idCheck(String id);
}
