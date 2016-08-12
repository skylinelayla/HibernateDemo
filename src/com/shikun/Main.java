package com.shikun;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.shikun.User;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

/**
 * Created by SHIKUN on 2016/8/12.
 */
public class Main {
    public static void main(String[] args)  {



    }

    public void createTable() {
        //创建表
        Configuration cfg = new Configuration().configure();
        SchemaExport sch = new SchemaExport(cfg);
        sch.create(true, true);
    }

    @Test
    public void add() {
        Configuration cfg = new Configuration().configure();
        //SessionFactory factory = cfg.buildSessionFactory();
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());

        ServiceRegistry service = ssrb.build();
        SessionFactory factory = cfg.buildSessionFactory(service);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        User user = new User();
        user.setEmail("1245@163.com");
        user.setPassword("1223");
        user.setName("jack");
        try {
            session.save(user);
            tx.commit();

        } catch (Exception e) {
            tx.rollback();

        }finally {
            session.close();
        }

    }

}
