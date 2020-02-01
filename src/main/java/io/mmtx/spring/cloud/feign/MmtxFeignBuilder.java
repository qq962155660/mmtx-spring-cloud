package io.mmtx.spring.cloud.feign;

import feign.Feign;

import org.springframework.beans.factory.BeanFactory;

/**
 * @author xiaojing
 */
final class MmtxFeignBuilder {

	private MmtxFeignBuilder() {
	}

	static Feign.Builder builder(BeanFactory beanFactory) {
		return Feign.builder().client(new MmtxFeignClient(beanFactory));
	}

}