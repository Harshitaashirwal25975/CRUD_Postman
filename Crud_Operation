SpringBoot REST API with Postman 
1. Features -- Create 
               Read
               Upadte
               Delete 
2. IDE used -- SpringToolSuite(STS4)
3. Installation --- The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

4. Technologies Used --  Spring Boot
                         Java
                         Postman
                         Mysql 
5. Database configuration ----  Create a MySQL database with the name studentdatabase and add the credentials to /resources/application.properties.
                               spring.datasource.url=jdbc:mysql://localhost:3306/studentdatabase
                               spring.datasource.username=root
                               spring.datasource.password=
                               spring.jpa.hibernate.ddl-auto=update

6. Usage ----    Run the project through the IDE and head out to http://localhost:8080
Here I have run this application in localhost and 8080 port. You can change the port as you wish. In application.properties you can write server.port =port no. you want
     or 
run this command in the command line:  mvn spring-boot:run
                    
7. API Signatures --
   localhost:8080/students
   This API will return all the list of students from database
   localhost:8080/students/{id}
   This API will give details of  a student of specific id .
   localhost:8080/students/delete/{Id}
   This API will give delete the student, that we send the  id in the url.
   localhost:8080/Students/update/{Id}
   This API will update the student, that we send the  id in the url.
   localhost:8080/students/add
   This API will add the new student in our database.
