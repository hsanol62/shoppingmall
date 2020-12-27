package util;

public class test {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이브 있다.");
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이브 없다.");
		}
	}
}
