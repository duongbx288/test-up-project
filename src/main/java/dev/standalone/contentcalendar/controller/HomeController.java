package dev.standalone.contentcalendar.controller;

import dev.standalone.contentcalendar.config.ContentCalendarProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@EnableConfigurationProperties
@RestController
public class HomeController {

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties){
        this.properties = properties;
    }
//
//    @Value("${cc.welcome-message: Default Welcome Message}")
//    private String welcomeMessage;
//
//    @Value("${cc.about}")
//    private String about;

    @GetMapping("/")
    public ContentCalendarProperties home() {
        return properties;
    }
}
