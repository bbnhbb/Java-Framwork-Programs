package org.example.Utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
  static Configuration cfg = null;
  static SessionFactory sessionFactory = null;
  static Session session = null;

  static {
    try {
      cfg = new Configuration();
      cfg.configure();
      sessionFactory = cfg.buildSessionFactory();
    } catch (HibernateException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static Session getSession() {
    if (sessionFactory != null) {
      session = sessionFactory.openSession();
    }
    return session;
  }

  public static void closeSession(Session session) {
    if (session != null) {
      session.close();
    }
  }
}
