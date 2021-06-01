package org.launchcode.spaday;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpaDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaDayApplication.class, args);
		//TODO why isn't this working, only adds user3
//		User user1 = new User("Will", "will@will.com", "password");
//		System.out.println(user1.getUsername());
//		User user2 = new User("Steve", "steve@steve.com", "password");
//		System.out.println(user2.getUsername());
//		User user3 = new User("Boib", "boib@boib.com", "password");
//		System.out.println(user3.getUsername());
//		UserData.add(user1);
//		UserData.add(user2);
//		UserData.add(user3);
//		System.out.println(user1.getUsername());
//		System.out.println(user2.getUsername());
//		System.out.println(user3.getUsername());
//		for (User user : UserData.getAll()) {
//			System.out.println(user.getUsername());
//		}

	}
}
