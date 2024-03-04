# Documentation for the Junior Java Apllication

## Installation requirements:
JDK 17
Maven 3.9.6
(both need to be added to your environment variables)

Optional:
Postman

## Start up
Open the "Testaufgabe" folder and use the command: mvn spring-boot:run to start the application

To access the stored data open a browser and navigate to http://localhost:8080/api/messages
or use the same url in postman and send a GET request.
There are two pictures in the screenshot folder of Postman and Chrome to see the result of the test.

## Content
This is a small RESTful API using Spring Boot. 
It contains a H2 in-memory database to store the data.
The data in the database can be accessed using the Spring Data JPA.


## Structure
The program is divided into small sections.

### Database
The first section is the H2 in-memory database.
The model for this project is the Message.java file.
It has an id which is automatically incremented each time a new entry is added.
It has two other attributes
<ol>
    <li>- The text of that message</li>
    <li>- Date of that message</li>
</ol>


### Repository
The database can be accessed through the MessageRepo.
It extends the JpaRepository to get access to the "findAll" method, needed to get the needed data

### Service
The MessageService provides a bridge between Controller and repository, so the Controller can access and work with the data.

### Controller
The MessageController handles the mapping of possible requests.
This controller handles the mapping of "/api" routes especially a GET request at "/api/messages".
It will provide a list of all Message entries in the database.
