package in.co.rays.util;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCDataSource {
	private static JDBCDataSource jds = null;

	private ComboPooledDataSource cpds=null;

	private JDBCDataSource() {
		
			ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.Driver");
		 
		
		try {
			cpds = new ComboPooledDataSource();
			cpds.setDriverClass(rb.getString("DriverClass"));
			cpds.setJdbcUrl(rb.getString("JDBCurl"));
			cpds.setUser(rb.getString("username"));
			cpds.setPassword(rb.getString("Password"));
			cpds.setInitialPoolSize (Integer.parseInt(rb.getString("Initialpoolsize")));
			cpds.setAcquireIncrement(Integer.parseInt(rb.getString("AcquireIncrement")));
			cpds.setInitialPoolSize(Integer.parseInt(rb.getString("MaxpoolSize")));

		} catch (PropertyVetoException e) {
			e.printStackTrace();

		}
	}

	public static JDBCDataSource getInstance() {

		if (jds == null) {
			jds = new JDBCDataSource();
		}
		return jds;
	}

	public static Connection getConnection() {
		try {
			return getInstance().cpds.getConnection();

		} catch (SQLException e) {

			return null;
		}
	}
}
