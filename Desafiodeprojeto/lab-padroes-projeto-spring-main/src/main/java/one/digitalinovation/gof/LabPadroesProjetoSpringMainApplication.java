package one.digitalinovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringMainApplication.class, args);
	}

}
