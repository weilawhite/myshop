import org.junit.Test;
import util.JDBCUtil;

import java.sql.Connection;

public class dbtest {
    @Test
    public void test1(){
        Connection conn= JDBCUtil.getConnection();

    }
}
