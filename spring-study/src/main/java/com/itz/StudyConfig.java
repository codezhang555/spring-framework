package com.itz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @PackageName: com.itz
 * @ClassName: StudyConfig
 * @Author: codeZhang
 * @DateTime: 2021/2/24 12:07
 * @Version 1.0
 */
@Configuration
@ComponentScan
public class StudyConfig {
	@Bean
	public User user(){
		return new User("001","zhang");
	}
}
