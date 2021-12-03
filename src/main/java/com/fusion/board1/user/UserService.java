package com.fusion.board1.user;

public interface UserService {
	public void join(UserVO param);
	public String login(UserVO param);
	public int idChk(UserVO param);
}
