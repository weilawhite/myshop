import dao.impl.CustomerDaoImpl;
import org.junit.Test;
import util.JDBCUtil;

import java.sql.Connection;

public class dbtest {
    @Test
    public void test1(){
        Connection conn= JDBCUtil.getConnection();
        CustomerDaoImpl customerDao=new CustomerDaoImpl();
        System.out.println(customerDao.login("87","8787"));

    }
}
