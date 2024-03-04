package Leon.S.Test;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import Leon.S.Test.model.Message;
import Leon.S.Test.repository.MessageRepo;

import java.sql.Date;


@SpringBootApplication
public class LeonSchinskiApplication {

	public static void main(String[] args) {
		SpringApplication.run(
				LeonSchinskiApplication.class, args);
	}


	/*
		CommandLineRunner to save two messages in the database
	 */
	@Bean
	public CommandLineRunner startup(MessageRepo messageRepo){
		return args -> {
			// add data
			messageRepo.save(
					new Message(
							"Das ist ein Test",
							new Date(System.currentTimeMillis())
					)
			);

			messageRepo.save(
					new Message(
							"Das ist ein zweiter Test",
							new Date(System.currentTimeMillis())
					)
			);
		};
	}


}
