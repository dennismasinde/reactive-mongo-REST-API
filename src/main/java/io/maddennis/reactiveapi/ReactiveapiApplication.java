package io.maddennis.reactiveapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class ReactiveapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveapiApplication.class, args);
	}

}
