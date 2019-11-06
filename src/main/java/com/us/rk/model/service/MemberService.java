package com.us.rk.model.service;

import com.us.rk.model.dto.MemberBean;

public interface MemberService {
	
	public void signCheck(MemberBean memberBean);

	public int idCheck(String id);
}
