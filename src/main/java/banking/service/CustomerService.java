package banking.service;

import java.sql.Connection;
import java.util.UUID;

import banking.config.DbConfig;

public class CustomerService {
	private static String CUSTOMER_TABLE = "customer";
	private Connection connection;

	public CustomerService() {
		try {
			connection = new DbConfig().getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void registerCustomer(String name, String email, String password) {
		var accountNumber = UUID.randomUUID().toString();
		var sql = "INSERT INTO %S (account_number,account_holder,email,password) (?,?,?,?)";
		
		try {
			var prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, accountNumber);
			prepareStatement.setString(2, name);
			prepareStatement.setString(3, email);
			prepareStatement.setString(4, password);
			
			prepareStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
