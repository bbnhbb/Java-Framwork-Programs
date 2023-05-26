spring maven project

Demo for  properties,
```
<properties>
  <spring.version>5.3.10</spring.version>
</properties>  
```

exclusion 
```
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.3.10.Final</version>
    <exclusions>
        <exclusion>
            <groupId>org.jboss.logging</groupId>
            <artifactId>jboss-logging</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```
