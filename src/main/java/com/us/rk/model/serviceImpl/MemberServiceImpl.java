package com.us.rk.model.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.us.rk.model.dao.MemberMapper;
import com.us.rk.model.dto.MemberBean;
import com.us.rk.model.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper memberMapper;

	@Override
	public void signCheck(MemberBean memberBean) {
		memberMapper.insertMember(memberBean);

	}

	@Override
	public int idCheck(String id) {
		System.out.println("serviceImpl: "+id);
		return memberMapper.idCheck(id);
	}
}
