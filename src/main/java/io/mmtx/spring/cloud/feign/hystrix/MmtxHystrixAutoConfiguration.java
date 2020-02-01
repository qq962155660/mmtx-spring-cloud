package io.mmtx.spring.cloud.feign.hystrix;

import com.netflix.hystrix.HystrixCommand;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaojing
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(HystrixCommand.class)
public class MmtxHystrixAutoConfiguration {

	@Bean
	MmtxHystrixConcurrencyStrategy seataHystrixConcurrencyStrategy() {
		return new MmtxHystrixConcurrencyStrategy();
	}

}