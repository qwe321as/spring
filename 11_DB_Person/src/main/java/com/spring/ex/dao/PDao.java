package com.spring.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.spring.ex.dto.PDto;

public class PDao {
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String user="jspid";
	private String pw="jsppw";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	private static PDao dao = null;

	// �̱��� �������� ��ü �����
	private PDao() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pw);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static PDao getInstance(){
		if(dao == null) {
			dao = new PDao();
		}
		return dao;
	}

	public void write(String id,String name,String age){
		String sql = "insert into person(num,id,name,age) values(person_seq.nextval,?,?,?)"; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, Integer.parseInt(age));

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)
					pstmt.close();
			}catch(Exception e) {

			}
		}
	}//
	public void modify(PDto dto) {
		String sql = "update person set id=?, name=?, age=? where num=?";
		try {
			pstmt = conn.prepareCall(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getAge());
			pstmt.setInt(4, dto.getNum());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)
					pstmt.close();
			}catch(Exception e) {
			}
		}
	}
	public ArrayList<PDto> list(){

		ArrayList<PDto> lists = new ArrayList<PDto>();
		String sql = "select * from person order by num asc";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int num = rs.getInt("num");
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				PDto dto = new PDto(num, id, name, age);
				lists.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)
					rs.close();
				if(pstmt!=null)
					pstmt.close();
			}catch(Exception e) {

			}
		} 

		System.out.println(lists.size());
		return lists;
	}//

	public PDto oneSelect(String num){

		PDto dto = null;
		String sql = "select * from person where num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(num));
			rs = pstmt.executeQuery();

			if(rs.next()) {
				int num2 = rs.getInt("num");
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				dto = new PDto(num2, id, name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)
					rs.close();
				if(pstmt!=null)
					pstmt.close();
			}catch(Exception e) {

			}
		} 
		return dto;
	}
	public void delete(String num1) {
		String sql = "delete from person where num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num1);
			pstmt.executeUpdate();
		} catch (SQLException e) {
		}finally {
			try {
				if(pstmt!=null)
					pstmt.close();
			}catch(Exception e) {
			}
		}
		
	}
}







