package com.tory.toryProjectA.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tory.toryProjectA.dao.MemberDao;
import com.tory.toryProjectA.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDao memberDao;
		
	@Override
	public String getUserName() {
		
		return memberDao.getUserName();
		
	}

}
