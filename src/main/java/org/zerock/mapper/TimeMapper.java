package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	//@Select("select sysdate from dual") //ø¿∂Û≈¨
	@Select("select SYSDATE() from dual") //mysql
	public String getTime();
	
	public String getTime1();
}