package com.nonage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.DBManager;

public class WorkerDAO {
	private WorkerDAO() {
	}

	private static WorkerDAO instance = new WorkerDAO();

	public static WorkerDAO getInstance() {
		return instance;
	}
	// ����� ������ ���� �޼ҵ� : -1:���̵� ���� X
	// 0:���̵� ���������� ��й�ȣ ����ġ
	// 1:���̵�� ��й�ȣ ��� ��ġ
	// login.jsp -> workerCheck.jsp
	
	// ���̵� �˻� �������� �־ ��� ��ȣ�� ���´�.	
	public int workerCheck(String userid, String userpw) {
		String sql = "select pwd from worker where id=?";
		int result = -1;
		// ���� ����
		Connection conn = null;
		// ������(select)�� �����ϱ� ���� ���� ��ü
		PreparedStatement pstmt = null;
		// ������� ������ ResultSet
		ResultSet rs = null;			
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if (rs.next()) { // �������ڷ� �� ���̵�� ��ġ�ϴ� ���� ����
				result = 0; // ��ϵ� ������...
				String dbPwd = rs.getString(1); // ��� ����� ��й�ȣ
				// ����� ��й�ȣ�� �Է��� ��й�ȣ ��ġ ����
				if (dbPwd.equals(userpw)) {
					result = 1; // ��й�ȣ ������ ��ġ
				}
			}
			DBManager.close(conn, pstmt, rs);
		} catch (Exception e) {
		}
		return result;
	}
	
}// WorkerDAO

