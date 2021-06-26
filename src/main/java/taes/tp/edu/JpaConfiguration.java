package taes.tp.edu;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("taes.tp.edu.*.repository")
public class JpaConfiguration {

}
