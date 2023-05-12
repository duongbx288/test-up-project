package dev.standalone.contentcalendar;

import dev.standalone.contentcalendar.config.ContentCalendarProperties;
import dev.standalone.contentcalendar.model.Content;
import dev.standalone.contentcalendar.model.Status;
import dev.standalone.contentcalendar.model.Type;
import dev.standalone.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableConfigurationProperties(ContentCalendarProperties.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(ContentRepository repository) {
//        return args -> {
//          // Insert data
//            Content c = new Content( null,
//                    "My First Blog Post",
//                    "My blog post",
//                    Status.IDEA,
//                    Type.ARTICLE,
//                    LocalDateTime.now(),
//                    null,
//                    "");
//            repository.save(c);
//        };
//    }

}
