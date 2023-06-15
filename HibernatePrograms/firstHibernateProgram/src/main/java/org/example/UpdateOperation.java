package org.example;

import org.example.Model.Employee;
import org.example.Utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateOperation {
  public static void runUpdate() {
    Session session = HibernateUtils.getSession();
    Transaction transaction = null;
    boolean flag = false;
    Employee emp = null;

    try {
      Integer id = 5;
      emp = session.get(Employee.class, id);

      if (session != null) {
        transaction = session.beginTransaction();
      }

      if (transaction != null) {
        if (emp != null) {
          emp.setEmpName("Bhushan");
          emp.setEmpSal(250000D);

          session.update(emp);
          flag = true;
        }
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
