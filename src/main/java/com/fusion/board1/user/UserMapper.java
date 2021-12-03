package com.fusion.board1.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	void insUser(UserVO param);
	UserVO selUser(UserVO param);
	UserVO idChk(UserVO param);
}
