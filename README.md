#ServiceRest

This is a web application to get values from labseq sequences.
A REST API that provides calculations for labseq. Built with Spring Boot, this API is able to perform efficient calculations and return the results to its clients.

##Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

###Prerequisites

To run the project, you will need:

    Java 11 or higher
    Maven

##Installation

To set up and run the project:

bash

```
git clone https://github.com/Cesar-Barbosa/labseqapi
cd labseqapi
mvn clean install
mvn spring-boot:run
```
Note:

To view the API documentation, the backend must be running.

##Running the Tests

Execute the automated tests with:

bash

```
mvn test

```


##Using the API:
###Directly via URL

You can test the API directly by visiting

After clicking on the url below, for further testing replace parameter 7 with any desired value to see the result of the labseq - l(n) sequence. Interactive test interface


[Teste com parâmetro 7](http://localhost:8080/labseq/7)


##For an interactive testing interface:

Navigate to:

[Teste url](http://localhost:8080/)

Enter the desired value.
Click on the GET button to view the result.

## Hypothesis handling:

User Input: Anticipating that the user can enter any value in the GET /labseq/{n} endpoint, I added a validation for negative values. In case of entering a negative value, the system will notify the user about the invalidity of the input.

Optimization with Cache: I implemented a caching system to improve the efficiency of the calculations. I found that the resulting values do not vary, making caching an effective strategy without risk of errors.

Security: As far as security is concerned, we have the spring.security.user.name and spring.security.user.password settings for authentication. Although they are only and exclusively for testing purposes, and under no condition are they used in other environments than the testing one; they are located in /labseqapi/src/main/resources/application.properties. Additionally, I implemented CORS configurations for access control.

Documentation: I integrated Swagger, providing a visual and interactive interface, making it easier for both users and developers to interact with the API.

Problems Identified: In the API response, I identified a limitation in representing very large integers. Also, due to the recursive nature of the calculation method in LabseqService, there is the potential for excessively deep calls, requiring attention. For this reason I implemented an error handling for large numbers.

Testing: To ensure the robustness of the system, I implemented tests covering various scenarios and validating the set assumptions. Unit tests, exception tests, performance tests and integration tests were performed.


##Swagger Documentation

The API's endpoints and details are well documented and can be accessed via Swagger at:


[Swagger documentation](http://localhost:8080/swagger-ui/index.html)

[Swagger analysis](http://localhost:8080/swagger-ui/index.html#/labseq-controller/getLabseqUsingGET)


##Security

The API is secured with basic authentication:

    Username: admin
    Password: admin

Please note that these credentials are just a template that was used for testing purposes.

###Built With

    Spring Boot - The framework used
    Maven - Dependency Management
    Swagger - Used for API documentation

##Contributing

Author

   Cesar Barbosa
   [Projeto Lab Seq API](https://github.com/Cesar-Barbosa/labseqapi)
    

##License

This project is licensed under the MIT License - read this LICENSE.md file for details to run this project and to test. 

##Acknowledgments:
Thank you to all the contributors, the Spring community and 
I would also like to express my gratitude for this opportunity. It was an enriching experience and I thank you for your trust.