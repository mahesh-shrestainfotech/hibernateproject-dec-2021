package com.sit.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.sit.entity.Bid;
import com.sit.entity.Item;

public class HibernateUtil {

	private final static SessionFactory SESSION_FACTORY;
	
	static {
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		
		properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/actionbazaar?useSSL=false");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "root@123");
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
		properties.put(Environment.SHOW_SQL,true);
		
		//configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(Item.class);
		configuration.addAnnotatedClass(Bid.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(properties).build();
		
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
}
