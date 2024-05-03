package fr.tln.univ.bank_management_system;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class SpringProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class,args);
    }
}
