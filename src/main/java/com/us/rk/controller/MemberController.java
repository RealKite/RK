package com.us.rk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@ResponseBody
	@RequestMapping(value="id_check",method=RequestMethod.GET)
	public int idCheck(@RequestParam("id")String id) {
		System.out.println("id: "+id);
		int re = memberService.idCheck(id);
		return re;
	}

}
