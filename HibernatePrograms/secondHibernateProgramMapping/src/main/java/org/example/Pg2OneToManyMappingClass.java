package org.example;

import java.util.HashSet;
import java.util.Set;
import org.example.Model.Department;
import org.example.Model.EmployeeDept;
import org.example.Utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Pg2OneToManyMappingClass {
  public static void RunInsert() {
    Session session = null;
    Transaction transaction = null;
    boolean flag = false;

    try {
      session = HibernateUtils.getSession();
      if (session != null) {
        transaction = session.beginTransaction();
      }

      EmployeeDept employeeDept = new EmployeeDept("Akash", 200000F, "MCC A Blcok");
      EmployeeDept employeeDept1 = new EmployeeDept("Niranjan", 100000F, "Niglingappa Badavane");
      EmployeeDept employeeDept2 = new EmployeeDept("Vinay", 50000F, "SS Layout");

      Set<EmployeeDept> empSet = new HashSet<>();
      empSet.add(employeeDept);
      empSet.add(employeeDept1);
      empSet.add(employeeDept2);

      Department d1 = new Department();
      d1.setDeptId("CS12");
      d1.setEmployees(empSet);
      d1.setDeptName("CS");

      session.save(d1);
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

  public static void RunGet() {
    Session session = null;
    Transaction transaction = null;
    boolean flag = false;

    try {
      session = HibernateUtils.getSession();
      if (session != null) {
        transaction = session.beginTransaction();
      }

      Department cs12 = session.get(Department.class, "CS12");
      System.out.println(cs12);
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
