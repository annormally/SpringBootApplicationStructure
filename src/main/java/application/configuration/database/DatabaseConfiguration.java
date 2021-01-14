package application.configuration.database;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("application.entities")
@EnableJpaRepositories("application.repositories")
public class DatabaseConfiguration {
}
