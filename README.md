# Airport Project
## What did I use?
* Java 8
* Spring Boot
* Lombok
* Maven
* Lombok
* Postman

### This project is a simple application to show my skills as a Java developer.

You don't need to download any CSV files. All in the "resources" folder.
I used H2 as database. It does not require any installation. The data is automatically sent to the database when the application runs.

### How to Run ? 
* mvn clean package spring-boot:repackage
* java -jar target/accProject-0.0.1-SNAPSHOT.jar
* The project defaults to http://localhost:8080

### Some requests? 
* Runways for each airport given a country code or country name.  
http://localhost:8080/countries/getCountriesByCode?codeOrName=Turkey
* Top 10 countries with highest number of airports.   
http://localhost:8080/countries/getTopTenCountry
* BONUS : Support retrieving the information given a partial/fuzzy country code/name as input parameter, e.g. entering 'zimb' will result in 'Zimbabwe'.    
http://localhost:8080/countries/getCountriesBonus?bonus=Zimb
