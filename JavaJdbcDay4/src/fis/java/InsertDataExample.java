package fis.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Lấy ra kết nối tới cơ sở dữ liệu.
		Connection connection = ConnectionUtils.getMyConnection();

		Statement statement = connection.createStatement();

		String sql = "Insert into Employee (EMP_NAME, EMP_NO) " 
					+ " values ('E6','ElonHoang')";

		// Thực thi câu lệnh.
		// executeUpdate(String) sử dụng cho các loại lệnh Insert,Update,Delete.
		int rowCount = statement.executeUpdate(sql);

		// In ra số dòng được trèn vào bởi câu lệnh trên.
		System.out.println("Row Count affected = " + rowCount);

	}
}
