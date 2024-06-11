package com.southpark;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.southpark.domain.ERole;
import com.southpark.domain.Rol;
import com.southpark.domain.User;
import com.southpark.repository.UserRepository;

@SpringBootApplication
public class SouthParkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SouthParkApplication.class, args);
	}

	// @Autowired
	// UserRepository userRepository;

	// @Autowired
	// PasswordEncoder passwordEncoder;


	// @Bean
	// CommandLineRunner init(){
	// 	return args -> {
	// 		User user = User.builder()
	// 			.email("santiago@mail.com")
	// 			.username("santiago")
	// 			.password(passwordEncoder.encode("1234"))
	// 			.roles(Set.of(Rol.builder().name(ERole.valueOf(ERole.ADMIN.name())).build()))
	// 			.build();

	// 		User user2 = User.builder()
	// 			.email("anyi@mail.com")
	// 			.username("anyi")
	// 			.password(passwordEncoder.encode("1234"))
	// 			.roles(Set.of(Rol.builder().name(ERole.valueOf(ERole.USER.name())).build()))
	// 			.build();
			
	// 			User user3 = User.builder()
	// 			.email("jeison@mail.com")
	// 			.username("jeison")
	// 			.password(passwordEncoder.encode("1234"))
	// 			.roles(Set.of(Rol.builder().name(ERole.valueOf(ERole.INVITED.name())).build()))
	// 			.build();

	// 		userRepository.save(user);
	// 		userRepository.save(user2);
	// 		userRepository.save(user3);
	// 	};
	// }

}
