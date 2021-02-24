package com.itz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @PackageName: com.itz
 * @ClassName: TestStudyBean
 * @Author: codeZhang
 * @DateTime: 2021/2/24 12:08
 * @Version 1.0
 */
public class TestStudyBean {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(StudyConfig.class);
		Object user = ac.getBean("user");
		System.out.println(user.toString());
	}
}
