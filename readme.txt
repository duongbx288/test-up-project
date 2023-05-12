# Check after: spring core, spring data docs

Learned in this exercise:

// Spring MVC, some spring core features
+ enum, record type in java
+ How spring handle instance of classes (Check more from Spring Core documentation)
+ How to generate HTTP request
+ Concept of @Autowired annotation

// Spring Data
+ Use Spring Data, query, spring data auto handle the crud query
+ different ways to use query to search data from database
+ CommandLineRunner, config, insert data after compiling

// Injecting properties into bean
+ configuration for production features
+ get and create custom variable from application.properties
    ( to use: need configuration-processor dependency -> use @EnableConfigurationProperties annotation
     in class scope, use @Value("${variable name}")
+ create configuration properties variable via Java class with @ConfigurationProperties annotation

// Spring profiles
+ Use @Profile annotation (at class level)
    (Ex: @Profile("!dev") means this bean/class won't run in 'dev' profiles)
+ new profile can be created by creating a new .properties file with following name pattern:
   application-profile_name.properties
+ choose what profile to be active: -> in application.properties: add spring.profiles.active=profile_name
+ work with yml files

// Production-ready features
+ Actuator & endpoints, with spring-boot-starter-actuator dependency
+ change logging level
