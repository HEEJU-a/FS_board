package com.fusion.board1.user;

import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private HttpSession session;
	
	public void join(UserVO param) {
		String cryptPw = BCrypt.hashpw(param.getPw(), BCrypt.gensalt());
        param.setPw(cryptPw);
        mapper.insUser(param);
	}
	
	public String login(UserVO param) {
		UserVO result = mapper.selUser(param);
		
		if(result == null) { //아이디 없음
			return "/user/login?err=1";
		}else if(BCrypt.checkpw(param.getPw(), result.getPw())) {//로그인 성공
			//세션처리
//			result.setPw(null);
			session.setAttribute("loginUser", result);
			return "/";
		}else {//비밀번호 틀림
			return "/user/login?err=2";
		}
	}
	
	public int idChk(UserVO param) {
		UserVO param2 = mapper.idChk(param);
		if(param2 == null) {
			return 0;
		}
		return 1;
	}
	
	
}
