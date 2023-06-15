package org.example;

import org.example.Model.Employee;
import org.example.Utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertOperation {
  public static void runSave() {
    Session session = null;
    Transaction transaction = null;
    boolean flag = false;

    try {
      session = HibernateUtils.getSession();

      if (session != null) {
        transaction = session.beginTransaction();
      }

      if (transaction != null) {
        Employee e = new Employee();
        e.setEmpName("Bharth");
        e.setEmpSal(150000D);

        Object save = session.save(e);
        System.out.println("saved Object" + save);
        flag = true;
      }
    } catch (HibernateException e) {
      e.printStackTrace();
    } finally {
      if (flag == true) {
        transaction.commit();
      } else {
        transaction.rollback();
      }
    }
  }

  public static void runPersist() {
    Session session = null;
    Transaction transaction = null;
    boolean flag = false;

    try {
      session = HibernateUtils.getSession();

      if (session != null) {
        transaction = session.beginTransaction();
      }

      if (transaction != null) {
        Employee e = new Employee();
        //        e.setEmpId(14);
        e.setEmpName("Bharth");
        e.setEmpSal(150000D);

        session.persist(e);
        flag = true;
      }
    } catch (HibernateException e) {
      e.printStackTrace();
    } finally {
      if (flag == true) {
        transaction.commit();
      } else {
        transaction.rollback();
      }
    }
  }
}
