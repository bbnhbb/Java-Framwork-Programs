package org.example;

import org.example.Model.Account;
import org.example.Model.Employee;
import org.example.Utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Pg1OneToOneMappingClass {
  public static void RunInsert() {
    Session session = null;
    Transaction transaction = null;
    boolean flag = false;

    try {
      session = HibernateUtils.getSession();
      if (session != null) {
        transaction = session.beginTransaction();
      }

      Account account = new Account();
      account.setAccNo("INC123");
      account.setAccName("Bharath");
      account.setAccType("Saving");

      Employee emp = new Employee();
      emp.setEmpId(1223);
      emp.setEmpName("Bharath");
      emp.setEmpSal(500000D);
      emp.setAccount(account);

      session.save(emp);

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

  public static Employee RunGet() {
    Session session = null;
    Transaction transaction = null;
    boolean flag = false;

    try {
      session = HibernateUtils.getSession();
      if (session != null) {
        transaction = session.beginTransaction();
      }

      return session.get(Employee.class, 1223);
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
    return null;
  }
}
