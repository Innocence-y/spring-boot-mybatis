package com.nuc.springboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:配置
 *
 * @author 闫文强
 * @create 2018-04-29 11:11
 */
@Configuration
public class MyBatisConfig {
	@Bean
	public ConfigurationCustomizer configurationCustomizer(){
		return  new ConfigurationCustomizer(){

			@Override
			public void customize(org.apache.ibatis.session.Configuration configuration) {
				configuration.setMapUnderscoreToCamelCase(true);
			}
		};
	}

}