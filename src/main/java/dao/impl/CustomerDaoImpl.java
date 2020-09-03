package dao.impl;

import dao.RoleDao;
import entity.Customer;
import entity.Role;
import util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CustomerDaoImpl implements RoleDao {

    public Role login(String username, String password) {
        String sql = "select * from customers where name=? and password=? ";
        Connection conn = JDBCUtil.getConnection();
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Customer customer = new Customer();
                customer.setId(resultSet.getInt("id"));
                customer.setName(resultSet.getString("name"));
                customer.setPassword(resultSet.getString("password"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setMoney(resultSet.getInt("money"));
                return customer;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    public boolean register(Role role) {
        Customer customer = (Customer) role;
        String sql = "INSERT INTO `myshop`.`customers` (`name`, `password`, `phone`, `money`) VALUES (?,?,?,?);";


        Connection conn = JDBCUtil.getConnection();
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getPassword());
            statement.setString(3, customer.getPhone());
            statement.setInt(4, customer.getMoney());
            statement.execute();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return true;
    }

    public boolean check(Role role) {
        Customer customer = (Customer) role;
        String sql = "select * from customers where phone = ?";
        Connection conn = JDBCUtil.getConnection();

        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, customer.getPhone());
            ResultSet resultSet = pre.executeQuery();

            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;

    }

    public boolean update(Role role) {
        return false;
    }

    public List<Role> findAll() {
        return null;
    }

    public Role findById(int id) {
        return null;
    }
}
