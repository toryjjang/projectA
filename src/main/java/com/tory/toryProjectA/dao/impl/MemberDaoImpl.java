package com.tory.toryProjectA.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tory.toryProjectA.dao.MemberDao;

@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
//	public void setSqlSession(SqlSession sqlSession) {
	//	this.sqlSession = sqlSession;
	//}
	
	@Override
	public String getUserName() {
		//return "test222";
		return sqlSession.selectOne("memberMapper.getUsers");
	}
	

}
