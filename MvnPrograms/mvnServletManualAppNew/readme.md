##Creating a maven project for web application in cmd line 

```
mvn archetype:generate -DgroupId=bbnhinew -DartifactId=mvnServletManualApp -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-webapp -Dpackage=in.bbnhinew -DinteractiveMode=false -Dpackaging=war -Dpackage=in.bbnhinew.controller;
```

* Inside src main create a folder for java and keep you servlets or java files (in the cmd given in.bbnhinew.controller as package still not created)
* add dependency for servlet in pom 
```
<!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.0.1</version>
      <scope>provided</scope>
    </dependency>
``` 
* add the different version of maven-war-plugin if not working 
```
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-war-plugin</artifactId>
        <version>3.2.2</version>
      </plugin>
    </plugins>
```
* as if error in compiler 
```
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
</properties> 
```
* "mvn package" will produce the war, take the war and do hard deployment 
* for soft deployment add this plugin 
```
      <!-- tomcat soft deployment -->
      <plugin>
        <groupId>org.apache.tomcat.maven</groupId>
        <artifactId>tomcat7-maven-plugin</artifactId>
        <version>2.1</version>
        <configuration>
          <server>tomcat</server>
          <url>http://localhost:8080/wishServlet</url>
          <path>/wishServlet</path>
          <port>8080</port>
        </configuration>
      </plugin>
```
* run the cmd "mvn tomcat7:run"