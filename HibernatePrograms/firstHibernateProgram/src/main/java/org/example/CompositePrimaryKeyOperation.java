package org.example;

import org.example.Model.Product;
import org.example.Model.ProgramId;
import org.example.Utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CompositePrimaryKeyOperation {
  public static void runGet() {
    Session session = HibernateUtils.getSession();
    Transaction transaction = null;
    Product prd = null;
    boolean flag = false;

    try {
      if (session != null) {
        transaction = session.beginTransaction();
      }
      if (transaction != null) {
        prd = new Product();
        prd.setPrmId(new ProgramId(10, 11));
        prd.setName("java course");
        prd.setPrice("50000");

        Object save = session.save(prd);
        System.out.println(save);
        flag = true;
      }

    } catch (HibernateException excp) {
      System.out.println(excp.getMessage());
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    } finally {
      if (flag == true) {
        transaction.commit();
      } else {
        transaction.rollback();
      }
    }
  }
}
