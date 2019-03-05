package cl.redbanc.payment.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * Spring Boot application starter class.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cl.redbanc.payment"})
@EnableSwagger2
@EnableMongoRepositories("cl.redbanc.payment.repository")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory, MongoMappingContext context) {
		MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), context);
		converter.setTypeMapper(new DefaultMongoTypeMapper(null));
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);
		return mongoTemplate;
	}
}
