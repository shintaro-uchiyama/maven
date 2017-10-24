mvn clean package 
docker cp target/myapp-1.0-SNAPSHOT.war tomcat-container1:/usr/local/tomcat/webapps/app.war
docker cp target/myapp-1.0-SNAPSHOT.war tomcat-container2:/usr/local/tomcat/webapps/app.war
