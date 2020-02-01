package io.mmtx.spring.cloud.web;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xiaojing
 */
@ConditionalOnWebApplication
public class MmtxHandlerInterceptorConfiguration implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MmtxHandlerInterceptor()).addPathPatterns("/**");
	}

}