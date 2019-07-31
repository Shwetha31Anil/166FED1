package com.mphasis.training.conf;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.mphasis.training")
public class AppConfig {
	@Bean
	public ViewResolver  getViewResolver() {
		InternalResourceViewResolver viewResolver
		=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;	
	}

	@Bean
	public DriverManagerDataSource getDataSource() {
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	ds.setUsername("java166");
	ds.setPassword("1234");
	return ds;
		}

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
	LocalSessionFactoryBean sessionFactory=
	new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
	Properties props=new Properties();
	props.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
	props.put("hibernate.hbm2ddl.auto", "update");
	props.put("hibernate.show_sql", "true");
	props.put("hibernate.format_sql", "true");
	sessionFactory.setHibernateProperties(props);
	//sessionFactory.setAnnotatedClasses(Employee.class);
	sessionFactory.setPackagesToScan("com.mphasis.training.entities");
	return sessionFactory;
	}
}
