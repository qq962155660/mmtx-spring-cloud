package io.mmtx.spring.cloud.feign;

import com.alibaba.cloud.sentinel.feign.SentinelFeign;
import feign.Feign;
import feign.Retryer;

import org.springframework.beans.factory.BeanFactory;

/**
 * @author xiaojing
 */
final class MmtxSentinelFeignBuilder {

	private MmtxSentinelFeignBuilder() {
	}

	static Feign.Builder builder(BeanFactory beanFactory) {
		return SentinelFeign.builder().retryer(Retryer.NEVER_RETRY)
				.client(new MmtxFeignClient(beanFactory));
	}

}