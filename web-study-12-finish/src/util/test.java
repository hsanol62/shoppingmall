package util;

public class test {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̺� �ִ�.");
			
		}catch(ClassNotFoundException e) {
			System.out.println("����̺� ����.");
		}
	}
}
