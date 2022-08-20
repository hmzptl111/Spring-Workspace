package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.producer.DBConnectionProducer;
import com.producer.MySQLConnection;
import com.producer.OracleConnection;
import com.producer.PostgreSQLConnection;
import com.producer.SybaseConnection;

@Configuration
public class ConnectionConfig {
	
	@Bean
	public MySQLConnection mysql() {
		MySQLConnection mysqlConnection = new MySQLConnection();
		mysqlConnection.setUrl("mysql_url");
		mysqlConnection.setUsername("mysql_user");
		mysqlConnection.setPassword("mysql_password");
		
		return mysqlConnection;
	}
	
	@Bean(name = "oracle")
	public OracleConnection getOracleConnection() {
		return new OracleConnection("oracle_url", "oracle_user", "oracle_password");
	}
	
	@Bean
	public PostgreSQLConnection postgres() {
		return new PostgreSQLConnection("postgres_url", "postgres_user", "postgres_password");
	}
	
	@Bean(name = "sybase")
	public SybaseConnection getSybaseConnection() {
		SybaseConnection sybaseConnection = new SybaseConnection();
		sybaseConnection.setUrl("sybase_url");
		sybaseConnection.setUsername("sybase_user");
		sybaseConnection.setPassword("sybase_password");
		
		return sybaseConnection;
	}
	
	@Bean
	public DBConnectionProducer dbConnection() {
		DBConnectionProducer db = new DBConnectionProducer();
//		db.setConnection(mysql());
//		db.setConnection(getOracleConnection());
//		db.setConnection(postgres());
		db.setConnection(getSybaseConnection());
		
		return db;
	}
}
