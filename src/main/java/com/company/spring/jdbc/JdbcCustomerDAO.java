package com.company.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.spring.xml.Customer;

@Service("customerDAO")
public class JdbcCustomerDAO implements CustomerDAO{

	@Autowired
	private DataSource dataSource;
	
	@Override
	public void insert(Customer customer) {
		Connection conn = null;
		String sql = "insert into java_play.Customer (first_name, last_name, email, active) values (?, ?, ?, ?)";
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, customer.getFirstName());
			ps.setString(2, customer.getLastName());
			ps.setString(3,  customer.getEmail());
			ps.setBoolean(4, customer.isActive());
			
			ps.executeUpdate();
			ps.close();
		} catch(SQLException e) {
			System.out.println(e);
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch(SQLException e) {}
			}
		}
	}

	@Override
	public Customer findByCustomerId(int customerId) {
		Customer result = null;
		String sql = "select * from java_play.Customer where id = ?";
		try(Connection conn = dataSource.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customerId);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				result = new Customer(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("email"), null, rs.getBoolean("active"));
			}
			rs.close();
			ps.close();
			
		} catch(SQLException e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public List<Customer> findByCustomeName(String customerName) {
		List<Customer> result = new ArrayList<Customer>();
		String sql = "select * from java_play.Customer where first_name = ? or last_name = ?";
		try(Connection conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setString(1, customerName);
			ps.setString(2, customerName);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Customer next  = new Customer(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("email"), null, rs.getBoolean("active"));
				result.add(next);
			}
			rs.close();
			
		} catch(SQLException e) {
			System.out.println(e);
		}
		return result;
	}

}
