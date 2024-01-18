package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// setter getter 필요 X
record Person (String name, int age) { };
record Address (String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {
	
	// @Bean: 스프링 컨테이너가 관리하는 Bean 을 생성한다는 의미
	@Bean
	public String name() {
		return "근학";
	}
	
	@Bean
	public int age() {
		return 30;
	}
	
	@Bean
	public Person person() {
		var person = new Person("근학2", 60);
		
		return person; 
	}
	
	@Bean(name="address2")
	public Address address() {
		var address = new Address("1St", "Seoul");
		
		return address; 
	}
	
}
