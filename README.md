#ServiceRest

A REST API that provides calculations for lab sequences. Built with Spring Boot, this API is capable of performing efficient calculations and returns results to its clients.

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

##Running the Tests

Execute the automated tests with:

bash

```
mvn test

```


##Using the API
###Directly via URL

You can test the API directly by visiting

After clicking on the url below, for further testing replace parameter 7 with any desired value to see the result of the labseq - l(n) sequence. Interactive test interface


[Teste com parâmetro 7](http://localhost:8080/labseq/7)


##For an interactive testing interface:

Navigate to:

[Teste url](http://localhost:8080/)

Enter the desired value.
Click on the GET button to view the result.

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

Acknowledgments:
Thank you to all the contributors, the Spring community and 
I would also like to express my gratitude for this opportunity. It was an enriching experience and I thank you for your trust.