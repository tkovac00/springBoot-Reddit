package com.example.udemy;

import com.example.udemy.models.Comment;
import com.example.udemy.models.Link;
import com.example.udemy.repositories.CommentRepository;
import com.example.udemy.repositories.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UdemyApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyApplication.class, args);
		System.out.println("Welcome!");
	}

	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
		return args ->{
			Link link = new Link("Spring Boot 2","https://start.spring.io/4");
			linkRepository.save(link);

			Comment comment = new Comment("This is a comment",link);
			commentRepository.save(comment);
			link.addComment(comment);

		};
	}

}
