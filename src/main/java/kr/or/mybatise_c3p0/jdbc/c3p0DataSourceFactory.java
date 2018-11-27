package kr.or.mybatise_c3p0.jdbc;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class c3p0DataSourceFactory implements DataSourceFactory {
	private ComboPooledDataSource dataSource = null;
	
	@Override
	public void setProperties(Properties properties) {
		this.dataSource = new ComboPooledDataSource();
		this.dataSource.setPassword(properties.getProperty("password"));
		this.dataSource.setJdbcUrl(properties.getProperty("url"));
		this.dataSource.setUser(properties.getProperty("username"));
		try {
			this.dataSource.setDriverClass(properties.getProperty("driver"));
		}catch(PropertyVetoException e) {}

	}

	@Override
	public DataSource getDataSource() {
		
		return (this.dataSource);
	}

}
