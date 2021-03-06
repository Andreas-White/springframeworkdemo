package com.example.jbrainsDataDemo.jdbcSpring.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public int getCircleCount() {
        String hql = "SELECT COUNT(*) FROM Circle";
        Query query = getSessionFactory().openSession().createQuery(hql) ;
        return (int) query.uniqueResult();
    }
}
