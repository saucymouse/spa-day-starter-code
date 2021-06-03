package org.launchcode.spaday;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpaDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaDayApplication.class, args);
		User user1 = new User("Will", "will@will.com", "password", "password");
		User user2 = new User("Steve", "steve@steve.com", "password", "password");
		User user3 = new User("Bob", "bob@bob.com", "password", "password");
		UserData.add(user1);
		UserData.add(user2);
		UserData.add(user3);
	}
}
