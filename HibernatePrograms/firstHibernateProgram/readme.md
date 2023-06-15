# Creating hibernate project in intelij

- under edit config
    - application select App.java and run
- If any issue try
    - mvn clean compile package
- This program is to add an entry into table
    - table created in mysql db -> name: sample -> table name emptab as configured in pom xml
- code for
    - insert
    - select
    - update
    - delete (yet to be added )
    - composite primary key

# Simple code to try if hibernate project working

```
package org.example;

import org.example.Model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/** Hello world! */
public class App {
public static void main(String[] args) {
try {
// creating the configuration object
Configuration cfg = new Configuration();

      //        configure hibernate.cfg.xml file to object
      Configuration configure = cfg.configure();

      //        create session Factory object
      SessionFactory sessionFactory = cfg.buildSessionFactory();

      //    create session object
      Session session = sessionFactory.openSession();
      //    begin trasaction
      Transaction transaction = session.beginTransaction();

      Employee e = new Employee();
      e.setEmpId(10);
      e.setEmpName("Bharth");
      e.setEmpSal(150000D);

      Object save = session.save(e);
      System.out.println("Hello");
      System.out.println(save);
      transaction.commit();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

}
}
```