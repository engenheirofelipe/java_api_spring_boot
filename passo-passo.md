# Step by step on how the project works
	
	* Initialize from spring.
		
	1. Open the site, create a project with name and package, choose MAVEN and java 17. Download the ZIP folder.
		2. Open the folder in eclipse after it is not ZIP.
		3. In the ApiApplication.java class add CommandLineRunner implements
		4. After that, implement the methods that have not yet been implemented. (run)
		
	* With the project created 
		
	1. Create a package called service (which will be used to call the API.
		2. Create a class called ConsumoApi.java
		3. Create method getData(String address). This method will be responsible for bringing the JSON into a string format
		4. In the API consumption class, insert logic for API request
		5.	Create an API consumption class´s instance to receive JSON.
		6. API address : https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c (GilmoreGirls)