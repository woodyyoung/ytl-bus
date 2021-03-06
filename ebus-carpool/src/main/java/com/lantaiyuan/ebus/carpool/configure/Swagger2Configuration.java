package com.lantaiyuan.ebus.carpool.configure;


import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @Title: Swagger2Configuration.java
 * @Package com.lantaiyuan.ebus.custom.configure
 * @Description: Swagger2的配置类
 * @author 刘伟 15818570028@163.com
 * @date 2016年12月21日 上午10:55:09
 * @version V1.0
 */

@Configuration
@EnableSwagger2
@Profile("dev")
public class Swagger2Configuration {

	@Bean
	public Docket accessToken() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("ebus-carpool")// 定义组
				.select() // 选择那些路径和api会生成document
				.apis(RequestHandlerSelectors.basePackage("com.lantaiyuan.ebus.carpool.controller")) // 拦截的包路径
				.paths(regex("/.*"))// 拦截的接口路径
				.build() // 创建
				.apiInfo(apiInfo()); // 配置说明
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()//
				.title("拼车模块swagger")// 标题
				.description("apprestful接口测试")// 描述
				.termsOfServiceUrl("http://www.lantaiyuan.com")//
				.contact(new Contact("wei.liu", "http://www.lantaiyuan.com", "97326081@qq.com"))// 联系
				.version("1.1")// 版本
				.build();
	}
}