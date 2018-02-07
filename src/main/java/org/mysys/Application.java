package org.mysys;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.mysys.model.Role;
import org.mysys.model.Users;
import org.mysys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application {
	@Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        Users user = new Users(
                "mysys",
                "MySys",
                "admin@mysys.com",
                passwordEncoder.encode("mysys"),
                Arrays.asList(
                        new Role("ROLE_USER"),
                        new Role("ROLE_ADMIN")));

        if (userRepository.findByEmail(user.getEmail()) == null){
            userRepository.save(user);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}