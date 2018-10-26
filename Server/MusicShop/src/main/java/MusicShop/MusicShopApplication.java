package MusicShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class MusicShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicShopApplication.class,args);

	}

}
