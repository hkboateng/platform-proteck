/**
 * Property of Proteck Software Inc
 */
package io.protecksoftware.platform.configuration.mq;

import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.support.converter.DefaultClassMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitBrokerConfiguration{

	@Bean
	public DefaultClassMapper classMapper() {
		DefaultClassMapper classMapper = new DefaultClassMapper();
		Map<String, Class<?>> idClassMapping = new HashMap<>();
		//idClassMapping.put("foo", Foo.class);

		classMapper.setIdClassMapping(idClassMapping);
		return classMapper;
	}
}
