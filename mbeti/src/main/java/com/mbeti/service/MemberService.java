package com.mbeti.service;

import com.mbeti.domain.MemberVO;

public interface MemberService {

	//회원가입
	public void register(MemberVO vo) throws Exception;
	
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	//회원정보수정
	public void memberUpdate(MemberVO vo) throws Exception;
	
	//회원탈퇴
	public void memberDelete(MemberVO vo) throws Exception;
    
	
	// 패스워드 체크
	public int passChk(MemberVO vo) throws Exception;
	
}
