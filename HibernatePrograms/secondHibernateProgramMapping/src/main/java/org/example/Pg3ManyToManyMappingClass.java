package org.example;

import java.util.HashSet;
import java.util.Set;
import org.example.Model.Course;
import org.example.Model.Student;
import org.example.Utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Pg3ManyToManyMappingClass {
  public static void RunInsert() {
    Session session = null;
    Transaction transaction = null;
    boolean flag = false;

    try {
      session = HibernateUtils.getSession();
      transaction = session.beginTransaction();
      Course c1 = new Course("C-111", "Java", 10000);
      Course c2 = new Course("C-112", "Python", 1000);
      Course c3 = new Course("C-113", "J2EE", 5000);

      Set<Course> courseSet = new HashSet<>();
      courseSet.add(c1);
      courseSet.add(c2);
      courseSet.add(c3);

      Student s1 = new Student("Sachin", "Mi", courseSet);
      Student s2 = new Student("Dhoni", "CSK", courseSet);
      Student s3 = new Student("Virat", "RCB", courseSet);

      session.save(s1);
      session.save(s2);
      session.save(s3);

      flag = true;
    } catch (HibernateException he) {
      he.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (flag) {
        transaction.commit();
        System.out.println("Object saved.....");
      } else {
        transaction.rollback();
        System.out.println("Object not saved....");
      }
    }
  }
}
