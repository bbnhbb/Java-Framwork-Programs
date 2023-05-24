### Maven program created in Intellij 

Add this code in pom.xml
```xml
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
</properties> 
```

For Intellij to run the program add this code to pom.xml
```xml
  <build>
    <plugins>
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <version>3.1.0</version>
        <executions>
          <execution>
            <id>swapnums</id>
            <phase>package</phase>
            <goals>
              <goal>java</goal>
            </goals>
          </execution>
        </executions>
        <configuration>
          <mainClass>in.inewbbnh.App</mainClass>
        </configuration>
      </plugin>
    </plugins>
  </build>
`````

command line use
```mvn:java``` 

Intellij: run 
```exec:java``` 