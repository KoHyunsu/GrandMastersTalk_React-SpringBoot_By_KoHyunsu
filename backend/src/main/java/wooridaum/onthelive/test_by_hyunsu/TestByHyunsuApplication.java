package wooridaum.onthelive.test_by_hyunsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TestByHyunsuApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestByHyunsuApplication.class, args);
    }

}
