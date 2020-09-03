import dao.impl.CustomerDaoImpl;
import entity.Customer;
import entity.Role;
import org.junit.Test;
import util.JDBCUtil;

import java.sql.Connection;

public class dbtest {
    @Test
    public void test1(){
        Connection conn= JDBCUtil.getConnection();
        CustomerDaoImpl customerDao=new CustomerDaoImpl();
        //System.out.println(customerDao.login("87","8787"));
        Customer customer=new Customer();
        customer.setName("999");
        customer.setPassword("8888");
        customer.setPhone("77777");
        customer.setMoney(5);
        customerDao.register(customer);
    }
}
