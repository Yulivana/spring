package net.proselyte.beanpostprocessor;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DAO {

    private DriverManagerDataSource driverManagerDataSource;

    public DriverManagerDataSource getDriverManagerDataSource() {
        return driverManagerDataSource;
    }

    public void setDriverManagerDataSource(DriverManagerDataSource driverManagerDataSource) {
        this.driverManagerDataSource = driverManagerDataSource;
    }

    public Connection getConnection(DriverManagerDataSource driverManagerDataSource) throws SQLException {
        Connection connection = driverManagerDataSource.getConnection();
        return connection;
    }
}
