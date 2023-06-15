package org.example;

import org.example.Model.Employee;
import org.example.Utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class SelectOperation {
  public static void runGet() {
    Session session = HibernateUtils.getSession();
    Employee e = null;
    Integer id = 7;

    try {
      if (session != null) {
        Employee employee = session.get(Employee.class, id);
        System.out.println(employee.getEmpId());
        System.out.println(employee.getEmpName());
        System.out.println(employee.getEmpSal());
      }

    } catch (HibernateException excp) {
      System.out.println(excp.getMessage());
    }
  }

  public static void runLoad() throws Exception {
    Session session = HibernateUtils.getSession();
    Employee employee = null;
    //    pass value which is not in db, line to print id will be executed
    Integer id = 18;

    try {
      employee = session.load(Employee.class, id);
      System.out.println(employee.getEmpId());
      System.in.read();
      System.out.println(employee.getEmpSal());
      System.out.println(employee.getEmpName());
    } catch (HibernateException excp) {
      System.out.println(excp.getMessage());
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
