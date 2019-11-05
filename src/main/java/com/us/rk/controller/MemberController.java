package com.us.rk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.us.rk.model.dto.MemberBean;
import com.us.rk.model.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="signUp",method = RequestMethod.GET)
	public String signUp(){
		return "member/signUp";
	}
	
	
	@RequestMapping(value="signCheck",method = RequestMethod.POST)
	public String signCheck(MemberBean memberBean){
		
		memberService.signCheck(memberBean);
		
		return "member/login";
	}

}
