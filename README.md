# TestZarsa
Self contained api rest with h2 db to simulate petitions


/*----------------------------------------------------------------------*/
  You can check the build and tests performed in each commit in "actions"
/*----------------------------------------------------------------------*/


/*--------------------------------------------------------------------*/
To build, test and run downlad and unzip the package.
Open a terminal and go to the directory where you unzipped the package, where the pom.xml is located
To run the project:
  ->Execute mvn clean package to build the project, this regenerates the .jar in /target
  ->In case that you don't have maven installed, there is a .jar already created, to run it go to /target and execute  java -jar .\TestZarsa-1.0.0.jar

  Once the application is running, go to http://localhost:8080/Test-Zarsa/swagger-ui/#/application-rest
  there you can try the endpoint to query the following table:
  
  PRICES
-------
 
BRAND_ID         START_DATE                                    END_DATE                        PRICE_LIST                   PRODUCT_ID  PRIORITY                 PRICE           CURR
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1         2020-06-14-00.00.00                        2020-12-31-23.59.59                        1                        35455                0                        35.50            EUR
1         2020-06-14-15.00.00                        2020-06-14-18.30.00                        2                        35455                1                        25.45            EUR
1         2020-06-15-00.00.00                        2020-06-15-11.00.00                        3                        35455                1                        30.50            EUR
1         2020-06-15-16.00.00                        2020-12-31-23.59.59                        4                        35455                1                        38.95            EUR

  
  One example of parameters with response is:
  
    fechaAplicacion :  2020-06-14T10:00:00
    idCadena : 1
    idProducto : 35455
      
  
  ->To only run the tests execute mvn test, logs contains descriptions of each one.


  
