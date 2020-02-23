package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();			
		}
	}
	
	@Test
	public void testConnection() {
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle",  //집
		//try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC&characterEncoding=UTF-8", /회사
				//"root",//회사
				//"56tyghbn56")){ //회사
				"shatiel",//회사
				"shatiel")){ //회사
			
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
}