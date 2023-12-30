package banking.config;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DbConfig {
    private BasicDataSource basicDataSource;

    public DbConfig() {
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/banking");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("Saichichi4321");
        basicDataSource.setMaxTotal(10);
    }

    public Connection getConnection() throws SQLException {
        return basicDataSource.getConnection();
    }
}
