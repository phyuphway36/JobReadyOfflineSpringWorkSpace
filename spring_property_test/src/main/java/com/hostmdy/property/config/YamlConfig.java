package com.hostmdy.property.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.hostmdy.property.bean.CloudDataSource;
import com.hostmdy.property.bean.DataSource;

@Configuration
@PropertySource("classpath:datasource.yml")
@EnableConfigurationProperties
@ConfigurationProperties
public class YamlConfig {
	
//
//	private String username;
//	private String password;
//	private String url;
//	private String service;
//	private String authentication;
//	private String cached;
//	
//	DataSource dataSource() {
//		return new DataSource(username, password, url, service, authentication, cached);
//	}
}
