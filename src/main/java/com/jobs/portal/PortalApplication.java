package com.jobs.portal;

import com.jobs.portal.security.Services.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(AccountService accountService) {
		return args -> {
//            accountService.CreateUser("admin","123","admin@gmail.com","123");
//            accountService.CreateUser("hajar","123","hajar@gmail.com","123");
//			accountService.CreateUser("RH","123","RH@gmail.com","123");
//            accountService.CreateRole("ADMIN");
//            accountService.CreateRole("EMPLOYEE");
//			accountService.CreateRole("RH");
//
//            accountService.AddRoleToUser("admin","ADMIN");
//            accountService.AddRoleToUser("hajar","EMPLOYEE");
//			accountService.AddRoleToUser("RH","RH");

            //System.out.println(accountService.loadUserByUsername("admin").getEmail());
            };
}

}
