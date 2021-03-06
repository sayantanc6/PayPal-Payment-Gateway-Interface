package dummy.config;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dummy.entity.OrderEntity;
import dummy.model.OrderModel;

@Configuration
public class DTOConfigurer extends BeanMappingBuilder {
	
	@Bean
	public DozerBeanMapper mapper() {
	    return new DozerBeanMapper();
	}
	
	@Autowired
	DozerBeanMapper mapper;

	@Override
	protected void configure() {
		mapping(OrderEntity.class, OrderModel.class, TypeMappingOptions.wildcard(false));

	}

}
